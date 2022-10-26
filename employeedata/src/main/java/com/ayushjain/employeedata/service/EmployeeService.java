package com.ayushjain.employeedata.service;

import com.ayushjain.employeedata.entity.Employee;

public interface EmployeeService {
    public Iterable<Employee> findAllEmployees();
    public Employee saveEmployee(Employee empObj);
    public Employee updateEmployee(int empId, Employee empObj);
    public String removeEmployee(int empId);
    public long countEmployees();
}
