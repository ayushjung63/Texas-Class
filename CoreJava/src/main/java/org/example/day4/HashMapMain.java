package org.example.day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Ram");
        hashMap.put(2,"Hari");

        System.out.println(hashMap.toString());

        hashMap.put(1,"Sita");
        System.out.println(hashMap.toString());

        hashMap.put(3,"Sita");
        System.out.println(hashMap.toString());

        hashMap.put(4,null);
        hashMap.put(5,null);
        hashMap.put(6,null);
        System.out.println(hashMap.toString());

        hashMap.put(null,"ABC");
        System.out.println(hashMap.toString());

        hashMap.put(null,"XYZ");
        System.out.println(hashMap.toString());

        Set<Integer> integers = hashMap.keySet();
        for (Integer key: integers){
            System.out.println("Key: "+key+" Value: "+hashMap.get(key));
        }

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry: entries){
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }

    }
}
