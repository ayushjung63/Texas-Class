package com.texas.demo.controller;

import com.texas.demo.dto.StudentDto;
import com.texas.demo.model.Student;
import com.texas.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public String save(@RequestBody Student student){
        String returnMessage = studentService.save(student);
        return returnMessage;
    }

    @GetMapping("/{id}")
    public StudentDto fetchStudent(@PathVariable("id") Integer id){
        return studentService.getById(id);
    }


    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String admin(){
        return "ADMIN";
    }

    @GetMapping("/student")
    @PreAuthorize("hasRole('STUDENT')")
    public String student(){
        return "STUDENT";
    }
}
