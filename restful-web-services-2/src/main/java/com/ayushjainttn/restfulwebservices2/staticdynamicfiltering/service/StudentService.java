package com.ayushjainttn.restfulwebservices2.staticdynamicfiltering.service;

import com.ayushjainttn.restfulwebservices2.staticdynamicfiltering.entity.Student;

import java.util.HashMap;

public interface StudentService {
    public HashMap getAllStudents();
    public Student addNewStudent(Student student);
    public Student getStudentById(int studentId);
}
