package org.example.day1.encapsulation;

public class Student {
    private String name;
    public String getName() {
        int x=10; // local
        // validation
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
        System.out.println("Object is creating");
    }
}
