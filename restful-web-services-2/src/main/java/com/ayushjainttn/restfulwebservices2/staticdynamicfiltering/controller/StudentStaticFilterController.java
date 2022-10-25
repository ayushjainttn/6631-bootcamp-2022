package com.ayushjainttn.restfulwebservices2.staticdynamicfiltering.controller;

import com.ayushjainttn.restfulwebservices2.staticdynamicfiltering.entity.Student;
import com.ayushjainttn.restfulwebservices2.staticdynamicfiltering.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentStaticFilterController {
    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/staticfilter/students")
    public HashMap getStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping(path = "/staticfilter/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        return studentService.getStudentById(studentId);
    }

    @PostMapping(path = "/staticfilter/students")
    public Student addStudents(@RequestBody Student student){
        return studentService.addNewStudent(student);
    }
}
