package dao;

import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateSessionFactory;

import java.util.List;

public class StudentDAO {
    private SessionFactory sessionFactory;

    public StudentDAO() {
        this.sessionFactory = HibernateSessionFactory.getSessionFactory();
    }

    public void save(Student student){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();

        // saving student to database
        // saving logic
        session.persist(student); // saves student to database

        transaction.commit();
        session.close();
    }

    public Student findById(Integer id){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();

        // core logic
        Student student = session.find(Student.class, id);

        transaction.commit();
        session.close();
        return student;
    }


    public void deleteById(Integer id){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();

        // core logic
        Student student = session.find(Student.class, id);
        session.remove(student);
        transaction.commit();
        session.close();
    }

    public List<Student> findAll(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();

        // core logic
        List<Student> studentList = session.createQuery("From Student", Student.class).getResultList();

        transaction.commit();
        session.close();
        return studentList;
    }
}
