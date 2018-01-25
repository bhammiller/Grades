package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainMethod {

    @RequestMapping("/")
    public String grader(){
        Grades grade = new Grades();
        String result = grade.grading();
        return result;
    }
}
