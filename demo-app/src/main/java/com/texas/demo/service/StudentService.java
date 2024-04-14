package com.texas.demo.service;

import com.texas.demo.dto.StudentDto;
import com.texas.demo.model.Student;

public interface StudentService {
    String save(Student student);

    StudentDto getById(Integer id);
}
