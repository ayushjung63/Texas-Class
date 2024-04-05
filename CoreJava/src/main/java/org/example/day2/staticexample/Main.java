package org.example.day2.staticexample;

public class Main {
    static {
        Student.javaInstructor="Shyam";
    }

    public static void main(String[] args) {
        Student student=new Student("Ram");
        System.out.println(student.getName());
    }
}
