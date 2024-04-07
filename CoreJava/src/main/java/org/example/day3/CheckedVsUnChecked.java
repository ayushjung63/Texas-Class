package org.example.day3;

import java.io.*;

public class CheckedVsUnChecked {
    public static void main(String[] args) {

        int x=10;
        int y=0;
        try {
            int z = x / y;
            System.out.println("Result: " + z);
            System.out.println("In Try Block");
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Always Executed");
        }
        CheckedVsUnChecked checkedVsUnChecked=new CheckedVsUnChecked();

    }

    public static void checkException(){
        File file=new File("abc.txt");
        try {
            FileReader fileReader=new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
