package com.ayushjainttn.restfulwebservices2.staticdynamicfiltering.controller;

import com.ayushjainttn.restfulwebservices2.staticdynamicfiltering.entity.Student;
import com.ayushjainttn.restfulwebservices2.staticdynamicfiltering.service.StudentService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;

@RestController
public class StudentDynamicFilterController {
    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/dynamicfilter/students")
    public MappingJacksonValue getStudents(){
        HashMap myBean = studentService.getAllStudents();
        return dynamicFilter(myBean);
    }

    @GetMapping(path = "/dynamicfilter/students/{studentId}")
    public MappingJacksonValue getStudentById(@PathVariable int studentId){
        Student student = studentService.getStudentById(studentId);
        return dynamicFilter(student);
    }

    @PostMapping(path = "/dynamicfilter/students")
    public MappingJacksonValue addStudents(@RequestBody Student student){
        Student newStudent = studentService.addNewStudent(student);
        return dynamicFilter(newStudent);
    }

    private MappingJacksonValue dynamicFilter(Object obj){
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(obj);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("studentName", "studentId", "studentEmail");
        FilterProvider filters = new SimpleFilterProvider().addFilter("myBean", filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }
}
