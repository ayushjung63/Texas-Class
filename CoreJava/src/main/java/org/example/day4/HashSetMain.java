package org.example.day4;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> stringHashSet=new HashSet<>();
        stringHashSet.add("Ram");
        stringHashSet.add("Shyam");
        stringHashSet.add("Hari");
        System.out.println(stringHashSet.toString());

        stringHashSet.add("Ram");
        System.out.println(stringHashSet.toString());

        System.out.println(stringHashSet.contains("Hari"));

        Iterator<String> iterator = stringHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        stringHashSet.remove("Hari");
        System.out.println(stringHashSet.toString());


    }
}
