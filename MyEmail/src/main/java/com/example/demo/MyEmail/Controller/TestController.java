package com.example.demo.MyEmail.Controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.MyEmail.Model.Student;

@RestController	
public class TestController
{
	@RequestMapping("/savestu")
    public Student saveStu(@RequestBody Student student)
    {
        System.out.println(student.toString());
        return student;
    }
}