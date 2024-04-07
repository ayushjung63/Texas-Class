package org.example.day3;

import org.example.day1.encapsulation.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        List<Person> studentList= new ArrayList<>();
        studentList.add(new Person("Ram"));
        System.out.println(studentList.get(0));


        List<Person> newStudentList= Arrays.asList(
                new Person("Hari"),
                new Person("Shyam")
        );
        System.out.println(newStudentList.get(2));
        
    }
}
