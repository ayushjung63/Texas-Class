import dao.StudentDAO;
import model.Student;

public class HibernateMain {
    public static void main(String[] args) {
        StudentDAO studentDAO=new StudentDAO();
//        Student student = new Student("Shyam", "CSIT");
//        studentDAO.save(student);

        System.out.println(studentDAO.findAll());
    }
}
