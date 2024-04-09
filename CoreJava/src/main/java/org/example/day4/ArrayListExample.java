package org.example.day4;

import java.util.ArrayList;

class NewStudent {
    private String name;
    private String faculty;

    public NewStudent(String name, String faculty) {
        this.name = name;
        this.faculty = faculty;
    }
    public NewStudent() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<NewStudent> newStudentArrayList = new ArrayList<>();
        newStudentArrayList.add(new NewStudent("Ram","BCA"));
        newStudentArrayList.add(new NewStudent("Shyam","CSIT"));
        newStudentArrayList.add(new NewStudent("Sita","BCA"));
        newStudentArrayList.add(new NewStudent("Hari","CSIT"));

        for (NewStudent newStudent : newStudentArrayList){
            System.out.println("Name: "+ newStudent.getName() +" and Faculty: "+ newStudent.getFaculty());
        }
    }
}
