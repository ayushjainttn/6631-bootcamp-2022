package com.ayushjainttn.restfulwebservices2.staticdynamicfiltering.service;

import com.ayushjainttn.restfulwebservices2.staticdynamicfiltering.entity.Student;
import com.ayushjainttn.restfulwebservices2.staticdynamicfiltering.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    public HashMap getAllStudents(){
        return studentRepository.retrieveStudents();
    }

    public Student addNewStudent(Student student){
        return studentRepository.addNewStudent(student);
    }

    public Student getStudentById(int studentId){
        Student student = (Student) studentRepository.retrieveStudents().get(studentId);
        return student;
    }
}
