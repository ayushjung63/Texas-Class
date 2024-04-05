package org.example.day1.encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Ram");

        Student s2=new Student("Shyam");

        System.out.println(s1.getName());
        System.out.println(s2.getName());
    }
}
