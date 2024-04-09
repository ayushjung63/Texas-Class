//package org.example.day5;
//
//public class SyncronizeMain {
//    int x=1;
//
//    public static void main(String[] args) {
//        SyncronizeMain main=new SyncronizeMain();
//        Thread t1=new Thread(() -> {
//for ( int i=0;i<5;i++){
//            main.incrementAndPrint();
//        }
//        );
//        Thread t2=new Thread(() -> main.incrementAndPrint());
//        t1.start();
//        t2.start();
//    }
//
//    public void incrementAndPrint(){
//        x++;
//        System.out.println("X Value: "+x);
//    }
//}
