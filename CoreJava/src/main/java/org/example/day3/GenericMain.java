package org.example.day3;

public class GenericMain {
    public static void main(String[] args) {
        printString("Hello World");
        printString(1);

        print("Hello World");
        print(1);
        print(1.111);

        int x=10;
        Integer xObject=10;

        double d=1.1;
        Double dObject=1.1;
    }

    public static <T>  void print( T data){
        System.out.println(data);
    }

    public static void printString(String str){
        System.out.println(str);
    }
    public static void printString(Integer value){
        System.out.println(value);
    }
}
