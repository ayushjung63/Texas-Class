package org.example.day4;

import org.example.day3.Person;
import org.example.day5.PersonImpl;
import org.example.day5.PersonInterface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Person> newStudentList = new LinkedList<>();
        newStudentList.add(new Person("Hari"));
        newStudentList.add(new Person("Shyam"));
        System.out.println(newStudentList.toString());

        newStudentList.get(1);
        newStudentList.addFirst(new Person("Sita"));
        System.out.println(newStudentList.toString());

        newStudentList.getFirst();

        for (Person p : newStudentList){
            System.out.println("Name : "+p.getName() );
        }


        PersonInterface personInterface=new PersonImpl();
    }
}
