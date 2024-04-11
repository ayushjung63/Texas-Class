package org.example.day5;

import org.example.anonymous.MouseInterface;
import org.example.anonymous.MouseInterfaceImpl;

public class PersonMain {
    public static void main(String[] args) {
        PersonInterface person=new PersonImpl(); // using concrete implementation
        person.walk();
        person.run();

        // using anonymous class :: implementation provided in scope where it is being used.
        // use this when implementation is only required in this place
        PersonInterface newPerson=new PersonInterface() {
            @Override
            public void walk() {
                System.out.println("New Person is walking");
            }

            @Override
            public void run() {
                System.out.println("New Person is running");
            }
        };

        newPerson.run();
        newPerson.walk();
    }
}
