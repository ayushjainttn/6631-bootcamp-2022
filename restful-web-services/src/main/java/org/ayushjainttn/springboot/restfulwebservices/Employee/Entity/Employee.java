package org.ayushjainttn.springboot.restfulwebservices.Employee.Service;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Employee {
    private int empId;

    //name should be atleast 3 letters long
    @Size(min = 3)
    private String empName;

    //an employee must not be of age < 18
    @Min(18)
    private int empAge;

    public Employee(int empId, String empName, int empAge) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}
