package rw.ac.rca.webapp.dao;

import rw.ac.rca.webapp.orm.Course;
import rw.ac.rca.webapp.orm.Marks;

import java.util.List;

public interface MarksDAO {
    public Marks saveCourse(Marks marks);
    public Marks updateCourse(Marks marks);
    public Marks saveOrUpdateCourse(Marks marks);
    public boolean deleteCourse(Marks marks);
    public Course getCourseById(int marksId);
    public List<Marks> getAllCourses();
}
