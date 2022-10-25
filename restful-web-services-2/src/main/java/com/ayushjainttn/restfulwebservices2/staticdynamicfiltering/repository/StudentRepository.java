package com.ayushjainttn.restfulwebservices2.staticdynamicfiltering.repository;

import com.ayushjainttn.restfulwebservices2.staticdynamicfiltering.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {
    private static int idGenerator;
    private static HashMap<Integer, Student> hashMap = new HashMap<>();

    public HashMap retrieveStudents(){
        return hashMap;
    }

    public Student addNewStudent(Student student){
        idGenerator +=1;
        student.setStudentId(idGenerator);
        hashMap.put(idGenerator, student);
        return student;
    }

}
