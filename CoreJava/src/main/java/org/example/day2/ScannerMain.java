package org.example.day2;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=sc.nextLine();
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        sc.next();
        System.out.println("Enter faculty: ");
        String faculty=sc.nextLine();

        System.out.println(name+" "+age+" "+faculty);
    }
}
