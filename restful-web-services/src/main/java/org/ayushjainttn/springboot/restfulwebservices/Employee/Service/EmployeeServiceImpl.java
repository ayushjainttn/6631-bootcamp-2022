package org.ayushjainttn.springboot.restfulwebservices.Employee.Service;

import org.ayushjainttn.springboot.restfulwebservices.Employee.Data.EmployeeDAO;
import org.ayushjainttn.springboot.restfulwebservices.Employee.Exceptions.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeDAO empDao;

    public List<Employee> getAllEmployees(){
        return empDao.retrieveEmployeeList();
    }

    public Employee getEmployeeById(int empId){
        Predicate<? super Employee> predicate = employee -> employee.getEmpId()==empId;
        Employee emp = empDao.retrieveEmployeeList().stream()
                .filter(predicate)
                .findAny()
                .orElseThrow(()-> new EmployeeNotFoundException("Employee not found with id: "+empId));
        return emp;
    }

    public String addNewEmployee(Employee empObj){
        empDao.addEmployeeToList(empObj);
        return "Added Employee to DB";
    }

    public String deleteEmployee(int empId){
        Predicate<? super Employee> predicate = employee -> employee.getEmpId()==empId;
        Employee emp = empDao.retrieveEmployeeList().stream()
                .filter(predicate)
                .findAny()
                .orElseThrow(()-> new EmployeeNotFoundException("Employee not found with id: "+empId));
        empDao.deleteEmployeeFromList(emp);
        return "Deletion Success";
    }

    public String updateEmployeeDetails(int empId, Employee empObj){
        Predicate<? super Employee> predicate = employee -> employee.getEmpId()==empId;
        Employee emp = empDao.retrieveEmployeeList().stream()
                .filter(predicate)
                .findAny()
                .orElseThrow(()-> new EmployeeNotFoundException("Employee not found with id: "+empId));
        emp.setEmpName(empObj.getEmpName());
        emp.setEmpAge(empObj.getEmpAge());
        return "Updated employee details in DB";
    }
}
