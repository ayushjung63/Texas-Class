import dao.AddressDAO;
import dao.StudentDAO;
import dto.AddressDto;
import model.Address;
import model.Student;

public class HibernateMain {
    public static void main(String[] args) {
//        StudentDAO studentDAO=new StudentDAO();
//        Student student = new Student("Shyam", "CSIT");
//        studentDAO.save(student);
//
////        System.out.println(studentDAO.findAll());
////
////        System.out.println(studentDAO.findAllStudentIdAndName());
//
//
//        Student myStudent = studentDAO.findById(52);
//        System.out.println(myStudent);


        AddressDAO addressDAO=new AddressDAO();

        AddressDto tempAddress=new AddressDto("PKR","TEMP",52);
        AddressDto permanentAddress=new AddressDto("KTM","PERM",52);

        addressDAO.save(tempAddress);
        addressDAO.save(permanentAddress);



    }
}
