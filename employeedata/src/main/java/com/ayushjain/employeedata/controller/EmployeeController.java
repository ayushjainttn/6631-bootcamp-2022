package com.ayushjain.employeedata.controller;

import com.ayushjain.employeedata.entity.Employee;
import com.ayushjain.employeedata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employees")
    public Iterable<Employee> getAllEmployees(){
        return employeeService.findAllEmployees();
    }

    @PostMapping(path = "/employees")
    public Employee addEmployees(@Valid @RequestBody Employee empObj){
        return employeeService.saveEmployee(empObj);
    }

    @PutMapping(path = "/employees/{empId}/updatedetails")
    public Employee modifyEmployee(@PathVariable int empId, Employee empObj){
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
}
