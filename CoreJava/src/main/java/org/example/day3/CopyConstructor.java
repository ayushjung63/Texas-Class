package org.example.day3;

public class CopyConstructor {
    public static void main(String[] args) {
        User user=new User();
        user.setName("Ram");

        User user1=new User("Shyam",1);

        User user2=new User(user1);
    }
}
