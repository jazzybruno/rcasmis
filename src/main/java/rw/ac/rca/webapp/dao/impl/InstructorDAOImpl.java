package rw.ac.rca.webapp.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import rw.ac.rca.webapp.dao.InstructorDAO;
import rw.ac.rca.webapp.orm.Instructor;

import java.util.List;

public class InstructorDAOImpl extends DAO implements InstructorDAO {

    public static final Logger LOG = Logger.getLogger(StudentDAOImpl.class);
    public static InstructorDAOImpl instance;

    public static InstructorDAOImpl getInstance(){
        if (instance == null){
            return new InstructorDAOImpl();
        }else{
            return instance;
        }
    }
    @Override
    public Instructor saveInstructor(Instructor instructor) {
        try {
            begin();
            getSession().save(instructor);
            commit();
            return instructor;
        }catch (Exception e){
            rollback();
            return null;
        }
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        try {
            begin();
            getSession().update(instructor);
            commit();
            return instructor;
        }catch (Exception e){
            rollback();
            return null;
        }
    }

    @Override
    public Instructor saveOrUpdateInstructor(Instructor instructor) {
        try {
            begin();
            getSession().saveOrUpdate(instructor);
            commit();
            return instructor;
        }catch (Exception e){
            rollback();
            return null;
        }
    }

    @Override
    public boolean deleteInstructor(Instructor instructor) {
        try {
            begin();
            getSession().delete(instructor);
            commit();
            return true;
        }catch (Exception e){
            rollback();
            return false;
        }
    }

    @Override
    public Instructor getInstructorById(int instructorId) {
        try {
            begin();
            Query query = getSession().createQuery("FROM Instuctor WHERE id = ref");
            query.setInteger("ref" , instructorId);
            Instructor instructor = (Instructor) query.uniqueResult();
            commit();
            return instructor;
        }catch (Exception e){
            rollback();
            return null;
        }
    }

    @Override
    public List<Instructor> getAllInstructor() {
        try {
            begin();
            Query query = getSession().createQuery("FROM Instuctor");
            List<Instructor> instructor =  query.list();
            commit();
            return instructor;
        }catch (Exception e){
            rollback();
            return null;
        }
    }
}
