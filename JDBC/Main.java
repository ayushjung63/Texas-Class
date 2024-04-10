import dao.PersonDAO;
import model.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonDAO personDAO=new PersonDAO();
//        Person person = new Person("Shyam", "PKR");
//        personDAO.save(person);
//        List<Person> personList = personDAO.findAll();
//        System.out.println(personList.toString());

        Person person = personDAO.findById(2);
        System.out.println(person);

        personDAO.updateNameById(2,"Hari");

        Person updatedPerson = personDAO.findById(2);
        System.out.println(updatedPerson);

    }
}
