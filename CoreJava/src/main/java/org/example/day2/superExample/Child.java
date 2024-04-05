package org.example.day2.superExample;

public class Child extends Parent{
    private String name;

    public Child(String name,String lastName) {
        super(lastName);
        this.name = name;
    }
    public Child() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
