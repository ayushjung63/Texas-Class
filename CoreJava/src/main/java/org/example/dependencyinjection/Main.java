package org.example.dependencyinjection;

public class Main {
    public static void main(String[] args) {
        College college=new College("Texas College");
        Student s1=new Student(college);

        College orchid=new College("Orchid College");
        Student s2=new Student(orchid);
        s1.read();
        s2.read();
    }
}
