package org.example.anonymous;

public class AnonMain {
    public static void main(String[] args) {
        MouseInterface mouseInterface=new MouseInterfaceImpl();
        mouseInterface.click();
        mouseInterface.doubleClick();


        MouseInterface anon=new MouseInterface() {
            @Override
            public void click() {
                System.out.println("Anonymouse Click");
            }

            @Override
            public void doubleClick() {
                System.out.println("Anonymouse Double Click");

            }
        };

        anon.click();
        anon.doubleClick();
    }
}
