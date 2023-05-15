package rw.ac.rca.webapp.dao.impl;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import rw.ac.rca.webapp.dao.MarksDAO;
import rw.ac.rca.webapp.orm.Marks;

import java.util.List;

public class MarksDAOImpl extends DAO implements MarksDAO {

    public static final Logger LOG = Logger.getLogger(MarksDAOImpl.class);
    public static MarksDAOImpl instance;

    public static MarksDAOImpl getInstance(){
        if (instance == null){
            return new MarksDAOImpl();
        }else {
            return instance;
        }
    }

    public MarksDAOImpl(){

    }

    @Override
    public Marks saveMarks(Marks marks) {
        try {
            begin();
            getSession().save(marks);
            commit();
            return marks;
        }catch (Exception e){
            rollback();
            return null;
        }
    }

    @Override
    public Marks updateMarks(Marks marks) {
        try {
            begin();
            getSession().update(marks);
            commit();
            return marks;
        }catch (Exception e){
            rollback();
            return null;
        }
    }

    @Override
    public Marks saveOrUpdateMarks(Marks marks) {
        try {
            begin();
            getSession().saveOrUpdate(marks);
            commit();
            return marks;
        }catch (Exception e){
            rollback();
            return null;
        }
    }

    @Override
    public boolean deleteMarks(Marks marks) {
        try {
            begin();
            getSession().delete(marks);
            commit();
            return true;
        }catch (Exception e){
            rollback();
            return false;
        }
    }

    @Override
    public Marks getMarksById(int marksId) {
        try {
            begin();
            Query query = getSession().createQuery("FROM marks WHERE marksId=ref");
            query.setInteger("ref" , marksId);
            Marks marks = (Marks) query.uniqueResult();
            commit();
            return marks;
        }catch (Exception e){
            rollback();
            return null;
        }
    }

    @SuppressWarnings(
            "unchecked"
    )
    public List<Marks> getAllMarks() {
        try {
            begin();
            Query query = getSession().createQuery("FROM Marks");
            List<Marks> marks = query.list();
            commit();
            return marks;
        }catch (Exception e){
            rollback();
            return null;
        }
    }
}
