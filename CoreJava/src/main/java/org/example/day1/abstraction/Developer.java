package org.example.day1.abstraction;

public interface Developer {
    void makeProgram();

    default void defaultProgram(){
        System.out.println("Default Method");
    }
}
