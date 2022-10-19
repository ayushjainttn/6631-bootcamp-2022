package org.ayushjainttn.springboot.restfulwebservices.Employee.Service;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int empId);
    public String addNewEmployee(Employee empObj);

    public String deleteEmployee(int empId);

    public String updateEmployeeDetails(int empId, Employee empObj);
}
