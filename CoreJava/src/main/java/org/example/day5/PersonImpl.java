package org.example.day5;

public class PersonImpl implements PersonInterface{
    @Override
    public void walk() {
        System.out.println("Person is walking");
    }

    @Override
    public void run() {
        System.out.println("Person is running");
    }
}
