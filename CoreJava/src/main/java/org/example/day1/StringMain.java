package org.example.day1;

public class StringMain {
    public static void main(String[] args) {
        String s1=new String("Ram");
        String s2=new String("Ram");
        System.out.println(s1.equals(s2));

        String s3="Shyam";
        s3= s3.concat(" Thapa");
        System.out.println(s3);
    }
}
