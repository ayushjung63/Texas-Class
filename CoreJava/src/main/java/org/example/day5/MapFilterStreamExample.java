package org.example.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Developer{
    private String name;
    private Integer salary;

    public Developer(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public Developer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
public class MapFilterStreamExample {
    public static void main(String[] args) {
        ArrayList<Developer> developerList=new ArrayList<>();
        developerList.add(new Developer("Ram",5000));
        developerList.add(new Developer("Shyam",7000));
        developerList.add(new Developer("Hari",9000));
        developerList.add(new Developer("Gita",11000));
        developerList.add(new Developer("Sita",15000));

        List<String> developerListWithSalaryLessThan10000 = developerList.stream()
                .filter(developer -> developer.getSalary() < 10000) //developer object
                .map(developer -> developer.getName()) // developer ko name only
                .collect(Collectors.toList());
        System.out.println(developerListWithSalaryLessThan10000.toString());

        developerList.stream()
                .filter(developer -> developer.getSalary() < 10000) //developer object
                .map(developer -> developer.getName()) // developer ko name only
                .forEach(x-> System.out.println(x));
    }
}
