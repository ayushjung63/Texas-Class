package org.example.day2.abstraction;

import org.example.day2.accessmodifier.Student;

class NewStudent extends Student{
    public void accessProctedClass(){
        this.proctectedMethod();
    }
}

public class Main2 {
    public static void main(String[] args) {
        NewStudent ns=new NewStudent();
        ns.accessProctedClass();
    }
}
