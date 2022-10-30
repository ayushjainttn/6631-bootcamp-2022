package com.ayushjainttn.springjpahibernate2.nativesqlandjpql.repository;

import com.ayushjainttn.springjpahibernate2.nativesqlandjpql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    /*
    JPQL:
    1. Display the first name, last name of all employees having salary greater than average salary
    ordered in ascending by their age and in descending by their salary.
    2. Update salary of all employees by a salary passed as a parameter whose existing salary is less
     than the average salary.
    3. Delete all employees with minimum salary.
     */


    //Querying 1 Query Database using JPQL
    @Query("SELECT firstName, lastName FROM Employee WHERE salary > :avgsalary ORDER BY age ASC, salary DESC")
    public List<Object[]> findEmployeeBySalaryGreaterThanAvgSalary(@Param("avgsalary") double avgSalary);

    //Querying Database using JPQL
    @Query("SELECT AVG(salary) FROM Employee")
    public List<Object[]> findEmployeeAvgSalary();

    //Querying Database using JPQL
    @Query("SELECT MIN(salary) FROM Employee")
    public List<Object[]> findEmployeesWithMinSalary();

    //Querying 2 Query Database using JPQL
    @Modifying
    @Query("UPDATE Employee SET salary = salary + :salary WHERE salary < :avgsalary")
    public void updateEmployeeSalaryIfSalaryLessThanAvgSalary(@Param("salary") double salary, @Param("avgsalary") double avgSalary);

    //Querying 3 Query Database using JPQL
    @Modifying
    @Query("DELETE FROM Employee WHERE salary = :minsalary")
    public void deleteEmployeesWithMinSalary(@Param("minsalary") double minSalary);



    /*
    Native SQL Query:
    1. Display the id, first name, age of all employees where last name ends with "singh"
    2. Delete all employees with age greater than 45(Should be passed as a parameter)
     */

    //Querying 1 Query Database using Native SQL
    @Query(value = "SELECT empId, empFirstName, empAge FROM employeeTable WHERE empLastName=:lastname", nativeQuery = true)
    public List<Object[]> findEmployeesWithLastName(@Param("lastname") String lastName);

    //Querying 2 Query Database using Native SQL
    @Modifying
    @Query(value = "DELETE FROM employeeTable WHERE empAge > :age", nativeQuery = true)
    public void deleteEmployeesWithAgeGreaterThan(@Param("age") int age);


}
