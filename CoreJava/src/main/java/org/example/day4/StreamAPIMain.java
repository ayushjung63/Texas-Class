//package org.example.day4;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//class Student{
//    private String name;
//    private String faculty;
//
//    private String contactNumber;
//
//    public Student(String name, String faculty) {
//        this.name = name;
//        this.faculty = faculty;
//    } public Student(String name, String faculty,String contactNumber) {
//        this.name = name;
//        this.faculty = faculty;
//        this.contactNumber=contactNumber;
//    }
//    public Student() {}
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getFaculty() {
//        return faculty;
//    }
//
//    public void setFaculty(String faculty) {
//        this.faculty = faculty;
//    }
//
//    public String getContactNumber() {
//        return contactNumber;
//    }
//
//    public void setContactNumber(String contactNumber) {
//        this.contactNumber = contactNumber;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", faculty='" + faculty + '\'' +
//                ", contactNumber='" + contactNumber + '\'' +
//                '}';
//    }
//}
//public class StreamAPIMain {
//    public static void main(String[] args) {
//        ArrayList<Student> newStudentArrayList = new ArrayList<>();
//        newStudentArrayList.add(new Student("Ram","BCA"));
//        newStudentArrayList.add(new Student("Shyam","CSIT"));
//        newStudentArrayList.add(new Student("Sita","BCA"));
//        newStudentArrayList.add(new Student("Hari","CSIT"));
//
//        //filter
//        List<Student> csitNewStudentList = newStudentArrayList.stream()
//                .filter(student -> student.getFaculty().equals("CSIT")) // intermediate
//                .collect(Collectors.toList()); // terminator;
//        System.out.println(csitNewStudentList);
//
//        List<String> studentUpperCaseList = newStudentArrayList.stream()
//                .map(student -> student.getName().toUpperCase())
//                .collect(Collectors.toList());
//        System.out.println(studentUpperCaseList.toString());
//
//        ArrayList<NewStudent> newStudentDataList = new ArrayList<>();
//        newStudentDataList.add(new Student("Ram","BCA","1234"));
//        newStudentDataList.add(new Student("Shyam","CSIT","1234"));
//        newStudentDataList.add(new Student("Sita","BCA","1234"));
//        newStudentDataList.add(new Student("Hari","CSIT","1234"));
//
//        System.out.println(newStudentDataList.toString());
//        List<StudentNameAndNumber> studentNameAndNumberList = newStudentDataList.stream()
//                .map(
//                        student -> {
//                    StudentNameAndNumber studentNameAndNumber = new StudentNameAndNumber();
//                    studentNameAndNumber.setName(student.getName());
//                    studentNameAndNumber.setContactNumber(student.getContactNumber());
//                    return studentNameAndNumber;
//                }
//                ).collect(Collectors.toList());
//
//        System.out.println(studentNameAndNumberList.toString());
//
//
//    }
//
//
//
//}
