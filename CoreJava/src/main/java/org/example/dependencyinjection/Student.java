package org.example.dependencyinjection;

public class Student {
    private College texasCollege;

    public Student(College texasCollege) {
        this.texasCollege = texasCollege;
    }

    public void read(){
        System.out.println("I read in "+texasCollege.getName());
    }
}
