package org.example.anonymous;

public class MouseInterfaceImpl implements MouseInterface{
    @Override
    public void click() {
        System.out.println("Single Click");
    }

    @Override
    public void doubleClick() {
        System.out.println("Double Click");

    }
}
