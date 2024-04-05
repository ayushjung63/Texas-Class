package org.example.day2.binding;


public class DynamicBindingMain {
    public static void main(String[] args) {
        Parent p =new Parent();
        p.walk();

        Parent p1=new Child();
        p1.walk();

        Child child=new Child();
        child.walk();
    }
}
