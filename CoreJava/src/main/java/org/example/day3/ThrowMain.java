package org.example.day3;

public class ThrowMain {
    public static void main(String[] args) {
        int age=10;
        if (age < 10){
            throw new RuntimeException("Age is less than 10");
        }
    }
}
