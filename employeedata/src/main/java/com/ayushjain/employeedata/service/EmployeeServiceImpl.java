package com.ayushjain.employeedata.service;

import com.ayushjain.employeedata.entity.Employee;
import com.ayushjain.employeedata.exceptions.EmployeeNotFoundException;
import com.ayushjain.employeedata.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
        Employee empUpdate = employeeRepository.findById(empId).get();
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

    public List<Employee> findEmployeeByName(String name){
        return employeeRepository.findByName(name);
    }

    public List<Employee> findEmployeeNameStartingWith(String startChar){
        return employeeRepository.findByNameStartingWith(startChar);
    }

    public List<Employee> findEmployeeBetweenAge(){
        return employeeRepository.findByAgeBetween(28,32);
    }

    public Page<Employee> findEmployeeSortByAgeAndPagination(int pageNumber){
        Pageable pageable = PageRequest.of(pageNumber-1,3, Sort.by(new Sort.Order(null, "age")));
        Page<Employee> result = employeeRepository.findAll(pageable);
        return result;
    }
}
