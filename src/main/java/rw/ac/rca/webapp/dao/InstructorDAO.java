package rw.ac.rca.webapp.dao;

import rw.ac.rca.webapp.orm.Course;
import rw.ac.rca.webapp.orm.Instructor;
import rw.ac.rca.webapp.orm.Marks;

import java.util.List;

public interface InstructorDAO {
    public Instructor saveCourse(Instructor instructor);
    public Instructor updateCourse(Instructor instructor);
    public Instructor saveOrUpdateCourse(Instructor instructor);
    public boolean deleteCourse(Instructor instructor);
    public Instructor getCourseById(int instructorId);
    public List<Instructor> getAllCourses();
}
