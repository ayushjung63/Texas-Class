package org.example.day2.accessmodifier;

public class Student {

    public void publicMethod(){
        System.out.println("Public Method:: Accessed from Everywhere");
    }
    private void privateMethod(){
        System.out.println("Private Method:: Accessed only within a class");
    }
    protected void proctectedMethod(){
        System.out.println("Protected Method:: Accessed within package and other packaage by sub class");
    }
    void defaultMethod(){
        System.out.println("Default Method:: Accessed within a package");
    }
}
