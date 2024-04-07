package org.example.day3;

public class Boxing {
    public static void main(String[] args) {
        int x=10;
        Integer xObject=x; // autoboxing

        acceptObjectType(x);

        Integer yObject=55;
        int y=yObject; // unboxing
    }

    public static void acceptObjectType(Integer data){

    }
}
