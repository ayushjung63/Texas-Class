package org.example.day2.binding;

public class CompileTimeExample {

    public static void main(String[] args) {
        CompileTimeExample cp=new CompileTimeExample();
        System.out.println(cp.add(1,2));
        System.out.println(cp.add(1,2,3));
//        System.out.println(cp.add(1,2,3,4));
    }

    public int add(int x, int y){
        return x+y;
    }
    public int add(int x, int y,int z){
        return x+y+z;
    }
}
