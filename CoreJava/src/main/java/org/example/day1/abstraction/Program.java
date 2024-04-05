package org.example.day1.abstraction;

public class Program {
    public Developer developer=new JavaDeveloper();
    public void makeMeAWebSite(){
        developer.makeProgram();
    }

    @Override
    public String toString() {
        return "Program{" +
                "developer=" + developer +
                '}';
    }
}
