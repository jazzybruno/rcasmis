package rw.ac.rca.webapp.dao;

import rw.ac.rca.webapp.orm.Course;
import rw.ac.rca.webapp.orm.Instructor;
import rw.ac.rca.webapp.orm.Marks;

import java.util.List;

public interface InstructorDAO {
    public Instructor saveInstructor(Instructor instructor);
    public Instructor updateInstructor(Instructor instructor);
    public Instructor saveOrUpdateInstructor(Instructor instructor);
    public boolean deleteInstructor(Instructor instructor);
    public Instructor getInstructorById(int instructorId);
    public List<Instructor> getAllInstructor();
}
