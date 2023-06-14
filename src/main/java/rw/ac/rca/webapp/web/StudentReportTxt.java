package rw.ac.rca.webapp.web;

import rw.ac.rca.webapp.dao.StudentDAO;
import rw.ac.rca.webapp.dao.impl.StudentDAOImpl;
import rw.ac.rca.webapp.orm.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.List;

public class StudentReportTxt extends HttpServlet {
    public StudentReportTxt(){
        super();
    }

    StudentDAO studentDAO = StudentDAOImpl.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        String pageRedirect =  req.getParameter("page");
        if(pageRedirect.equals("studenttxt")){
            String filePath = "/Uploads";
            String fileName = "student.txt";
            String fullPath = filePath + File.separator + fileName;

            List<Student> students = studentDAO.getAllStudent();
            if(students != null){
             File file = new File(fullPath);
             file.getParentFile().mkdirs();
             file.createNewFile();

              try (OutputStream fos  = new FileOutputStream(file)){
                  for (Student student : students){
                         String fullName = student.getFirstName() + student.getLastName();
                         String phoneNumber = student.getPhoneNumber();
                         String dob = student.getDateOfBirth().toString();
                         boolean isInt = student.isInternational();
                         boolean isPart = student.isPartTime();
                         boolean isRepeat = student.isRepeating();

                         fos.write(fullName.getBytes());
                         fos.write(phoneNumber.getBytes());
                         fos.write(dob.getBytes());
                         fos.write(new byte[] { (byte) (isInt ? 1 : 0) });
                         fos.write(new byte[] { (byte) (isPart ? 1 : 0) });
                         fos.write(new byte[] { (byte) (isRepeat ? 1 : 0) });

                         fos.write(System.lineSeparator().getBytes());
                  }
              }

              resp.setContentType("application/octet-stream");
              resp.setContentLength((int) file.length());
              resp.setHeader("Content-Disposition" , "attachment; filename=\"" + file.getName() + "\"");

                ServletOutputStream outputStream = resp.getOutputStream();
                byte[] buffer = new byte[4096];
                int bytesRead;

                try (FileInputStream fis = new FileInputStream(file)) {
                    while ((bytesRead = fis.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }
                }
                outputStream.close();
                RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/students.jsp");
                dispatcher.forward(req, resp);
            }
        }

    }

}
