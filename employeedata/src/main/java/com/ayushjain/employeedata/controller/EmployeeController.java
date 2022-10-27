package com.ayushjain.employeedata.controller;

import com.ayushjain.employeedata.entity.Employee;
import com.ayushjain.employeedata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employees")
    public Iterable<Employee> getAllEmployees(){
        return employeeService.findAllEmployees();
    }

    @PostMapping(path = "/employees")
    public ResponseEntity<Employee> addEmployees(@Valid @RequestBody Employee empObj){
        Employee empCreated = employeeService.saveEmployee(empObj);
        return new ResponseEntity<>(empCreated, HttpStatus.CREATED);
    }

    @PutMapping(path = "/employees/{empId}/updatedetails")
    public Employee modifyEmployee(@PathVariable int empId, @RequestBody Employee empObj){
        return employeeService.updateEmployee(empId,empObj);
    }

    @DeleteMapping(path = "/employees/{empId}/delete")
    public String deleteEmployee(@PathVariable int empId){
        return employeeService.removeEmployee(empId);
    }

    @GetMapping(path = "/employees/count")
    public long getEmployeeCount(){
        return employeeService.countEmployees();
    }

    @GetMapping(path = "/employees/{empName}")
    public List<Employee> getEmployeesByName(@PathVariable String empName){
        return employeeService.findEmployeeByName(empName);
    }

    @GetMapping(path = "/employees/namestartwith/{startChar}")
    public List<Employee> getEmployeesByNameWithStartLetterA(@PathVariable String startChar){
        return employeeService.findEmployeeNameStartingWith(startChar);
    }

    @GetMapping(path = "/employees/agebetween28and32")
    public List<Employee> getEmployeesByAgeBetween(){
        return employeeService.findEmployeeBetweenAge();
    }

    @GetMapping(path = "/employees/pages/{pageNumber}")
    public Page<Employee> getEmployeesByAgeAndPage(@PathVariable int pageNumber){
        return employeeService.findEmployeeSortByAgeAndPagination(pageNumber);
    }
}
