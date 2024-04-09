package org.example.day5;

// Thread class extend
// Runnable interface implement

class  EmailThread extends Thread{
    @Override
    public void run() {
        System.out.println( Thread.currentThread().getName()+ ":: I am sending email");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+ ":: Email sent successfully");
    }
}

class PrintThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "::  am printing.....");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+ ":: Printing Completed.....");
    }
}

public class ThreadMain {
    public static void main(String[] args) {

        EmailThread emailThread=new EmailThread();
        emailThread.start();

        PrintThread printThread=new PrintThread();
        printThread.start();

        Runnable lambdaThread=() -> {
                System.out.println(Thread.currentThread().getName()+ ":: I am new Thread in lambda.....");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+ ":: New Thead in Lambda Completed.....");
        };
        lambdaThread.run();
    }

//    public  void sendEmail(){
//        System.out.println("I am sending email");
//        System.out.println("I am sending email");
//        System.out.println("I am sending email");
//        System.out.println("I am sending email");
//        System.out.println("I am sending email");
//        System.out.println("I am sending email");
//        System.out.println("I am sending email");
//        System.out.println("I am sending email");
//        System.out.println("Email sent successfully");
//    }
//
//    public  void print(){
//        System.out.println("I am printing.....");
//        System.out.println("I am printing.....");
//        System.out.println("I am printing.....");
//        System.out.println("I am printing.....");
//        System.out.println("I am printing.....");
//        System.out.println("I am printing.....");
//        System.out.println("I am printing.....");
//        System.out.println("Printing Completed.....");
//    }
}
