package org.example.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsMain {
    public static void main(String[] args) throws FileNotFoundException {
        giveMeFileContent();
    }

    public static void giveMeFileContent() throws FileNotFoundException {
        readFile();
    }

    public static void readFile() throws FileNotFoundException {
        File file=new File("abc.txt");
        FileReader fileReader=new FileReader(file);
    }
}
