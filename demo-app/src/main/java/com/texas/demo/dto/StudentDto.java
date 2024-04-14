package com.texas.demo.dto;

public class StudentDto {
    private Integer id;
    private String name;
    private String faculty;

    public StudentDto(Integer id, String name, String faculty) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
    }

    public StudentDto(String name, String faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    public StudentDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
