package com.ayushjainttn.springjpahibernate2.repository;

import com.ayushjainttn.springjpahibernate2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query("SELECT firstName, lastName FROM Employee WHERE salary > (select AVG(salary) FROM Employee) ORDER BY age ASC, salary DESC")
    public List<Object[]> findEmployeeBySalaryGreaterThanAverageSalary();
}
