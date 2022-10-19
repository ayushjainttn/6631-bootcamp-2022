package org.ayushjainttn.springboot.restfulwebservices.Employee.Controller;

import org.ayushjainttn.springboot.restfulwebservices.Employee.Service.Employee;
import org.ayushjainttn.springboot.restfulwebservices.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService empService;

    //    GET http request for Employee to get list of employees.
    @GetMapping(path = "/employees")
    public List<Employee> findAllEmployees(){
        return empService.getAllEmployees();
    }

    //    GET http request using path variable top get one employee
    @GetMapping(path = "/employees/{empId}")
    public Employee findEmployeeById(@PathVariable int empId){
        return empService.getEmployeeById(empId);
    }

    //    POST http request for Employee to create a new employee.
    @PostMapping(path = "/employees")
    public String addEmployees(@Valid @RequestBody Employee empObj){
        return empService.addNewEmployee(empObj);
    }

    //    Implement DELETE http request for Employee to delete employee
    @DeleteMapping(path = "/employees/{empId}")
    public String deleteEmployeeById(@PathVariable int empId){
        return empService.deleteEmployee(empId);
    }

    //    Implement PUT http request for Employee to update employee
    @PutMapping(path = "/employees/{empId}/update")
    public String updateEmployeeDetails(@PathVariable int empId, @RequestBody Employee empObj){
        return empService.updateEmployeeDetails(empId, empObj);
    }


}
