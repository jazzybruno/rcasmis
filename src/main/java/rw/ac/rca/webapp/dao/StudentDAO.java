package rw.ac.rca.webapp.dao;

import rw.ac.rca.webapp.orm.Course;
import rw.ac.rca.webapp.orm.Marks;
import rw.ac.rca.webapp.orm.Student;

import java.util.List;

public interface StudentDAO {
    public Student saveCourse(Student student);
    public Student updateCourse(Student student);
    public Student saveOrUpdateCourse(Student student);
    public boolean deleteCourse(Student student);
    public Student getCourseById(int studentId);
    public List<Student> getAllCourses();
}
