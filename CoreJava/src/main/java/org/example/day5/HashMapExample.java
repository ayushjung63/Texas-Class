package org.example.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> studentMap=new HashMap<>();
        studentMap.put("Ram",80);
        studentMap.put("Shyam",90);
        studentMap.put("Hari",100);
        studentMap.put("Gita",70);
        studentMap.put("Sita",60);

        Set<String> keyList = studentMap.keySet();
        for (String key: keyList){
            System.out.println("Student: " + key +" Mark: "+ studentMap.get(key));
        }

        System.out.println("--------------");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry: entries){
            System.out.println("Student: " + entry.getKey() +" Mark: "+ entry.getValue());
        }
    }
}
