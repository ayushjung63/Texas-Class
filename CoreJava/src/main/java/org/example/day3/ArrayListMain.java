package org.example.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<Person> studentList= new ArrayList<>();
        studentList.add(new Person("Ram"));
        System.out.println(studentList.get(0));
//        studentList.add(0,);


        List<Person> newStudentList= Arrays.asList(
                new Person("Hari"),
                new Person("Shyam")
        );
//        System.out.println(newStudentList.get(1));

        for (Person p : newStudentList){
            System.out.println(p.getName());
        }
        
    }
}
