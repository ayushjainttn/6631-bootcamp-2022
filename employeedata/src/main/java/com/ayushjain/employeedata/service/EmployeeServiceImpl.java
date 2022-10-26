package com.ayushjain.employeedata.service;

import com.ayushjain.employeedata.entity.Employee;
import com.ayushjain.employeedata.exceptions.EmployeeNotFoundException;
import com.ayushjain.employeedata.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    public Iterable<Employee> findAllEmployees(){
        Iterable<Employee> result = employeeRepository.findAll();
        return result;
    }

    public Employee saveEmployee(Employee empObj){
        return employeeRepository.save(empObj);
    }

    public Employee updateEmployee(int empId, Employee empObj){
        if(employeeRepository.existsById(empId)==false){
            throw new EmployeeNotFoundException("Employee not found with id : "+empId);
        }
        Employee empUpdate = employeeRepository.getReferenceById(empId);
        empUpdate.setId(empId);
        empUpdate.setName(empObj.getName());
        empUpdate.setAge(empObj.getAge());
        empUpdate.setLocation(empObj.getLocation());
        return employeeRepository.save(empUpdate);
    }

    public String removeEmployee(int empId){
        if(employeeRepository.existsById(empId)==false){
            throw new EmployeeNotFoundException("Employee not found with id : "+empId);
        }
        employeeRepository.deleteById(empId);
        return HttpStatus.OK.toString();
    }

    public long countEmployees(){
        return employeeRepository.count();
    }
}
