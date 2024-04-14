package com.texas.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        return helloService.getHelloMessage();
    }

//    @GetMapping("/student/{id}")
//    public String fetchStudentById(@PathVariable("id") Integer id){
//        return "Student fetched with id: " +id;
//    }

    @GetMapping("/post")
    public String fetchPostById(@RequestParam("postId") Integer postId){
        return "Post fetched with id: " +postId;
    }
}
