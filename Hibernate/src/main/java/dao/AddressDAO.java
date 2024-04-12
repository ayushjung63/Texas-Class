package dao;

import dto.AddressDto;
import model.Address;
import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateSessionFactory;

public class AddressDAO {

    private SessionFactory sessionFactory;

    public AddressDAO() {
        this.sessionFactory = HibernateSessionFactory.getSessionFactory();
    }

    // takes dto class as paramater
    public void save(AddressDto addressDto){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        Address address=new Address();
        address.setName(addressDto.getName());
        address.setType(addressDto.getType());

        Student student = session.find(Student.class, addressDto.getStudentId());
        address.setStudent(student);

        session.persist(address);

        transaction.commit();
        session.close();
    }


}
