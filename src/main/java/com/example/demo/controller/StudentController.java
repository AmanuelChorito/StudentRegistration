package com.example.demo.controller;

import com.example.demo.domain.Gender;
import com.example.demo.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student>getAllStudents(){
       List<Student>students= Arrays.asList(new Student(1L,
                "Jamila",
                "amigos@code.edu", Gender.FEMALE), new Student(2L,
               "Aman",
               "aman@code.edu", Gender.MALE));

    return students;
    }

}
