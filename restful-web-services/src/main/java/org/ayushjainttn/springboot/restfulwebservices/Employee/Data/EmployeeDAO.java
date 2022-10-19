package org.ayushjainttn.springboot.restfulwebservices.Employee.Data;

import org.ayushjainttn.springboot.restfulwebservices.Employee.Service.Employee;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAO {
    //emoloyee id generator
    private static int empIdGenerator = 5;
    private static List<Employee> empList = new ArrayList<>();

    //populating employee list with some objects of employee type
    static {
        empList.add(new Employee(1, "Ayush", 22));
        empList.add(new Employee(2, "Rakesh",22));
        empList.add(new Employee(3, "Mohit", 21));
        empList.add(new Employee(4,"Raj",20));
    }

    //to retrieve all employees from employee list
    public List<Employee> retrieveEmployeeList(){
        return empList;
    }

    //to add employees to from employee list
    public String addEmployeeToList(Employee empObj){
        empObj.setEmpId(empIdGenerator);
        empList.add(empObj);
        empIdGenerator +=1;
        return "Success";
    }

    //to delete employees from employee list
    public String deleteEmployeeFromList(Employee empObj){
        empList.remove(empObj);
        return "Deletion Success";
    }
}
