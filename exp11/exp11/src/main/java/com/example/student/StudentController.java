package com.example.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Student REST API";
    }

    
    @GetMapping("/student")
    public Student getSampleStudent() {
        return new Student(1L, "Sushant", "CSE");
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
        
        return student;
    }
}
