package org.example.day2.staticexample;

public class Student {
    public static String javaInstructor;
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Student() {
        System.out.println("Default Constructor also called");
    }

    public void setName(String name) {
        this.name = name;
    }
}
