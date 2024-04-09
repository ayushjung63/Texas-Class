package org.example.day5;

// functional interface
@FunctionalInterface
interface Programmer{
    void code();
}

public class LambdaMain {
    public static void main(String[] args) {
        Programmer newProgrammer=() -> {
                System.out.println("I code in New Lang");
                System.out.println("I code in New Lang");
                System.out.println("I code in New Lang");
                System.out.println("I code in New Lang");
                System.out.println("I code in New Lang");
                System.out.println("I code in New Lang");
            };
        newProgrammer.code();
        Programmer javaProgrammer=() -> System.out.println("I code in Java");
        javaProgrammer.code();
    }
}
