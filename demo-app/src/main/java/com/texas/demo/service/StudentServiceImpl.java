package com.texas.demo.service;

import com.texas.demo.dto.StudentDto;
import com.texas.demo.model.Student;
import com.texas.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public String save(Student student) {
        studentRepo.save(student);
        return "Saved to DB";
    }

    public StudentDto getById(Integer id){
        Student student = studentRepo.findById(id).get();
        StudentDto studentDto=new StudentDto();
        studentDto.setFaculty(student.getFaculty());
        studentDto.setName(student.getName());
        return studentDto;
    }
}
