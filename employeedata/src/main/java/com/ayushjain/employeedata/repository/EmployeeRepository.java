package com.ayushjain.employeedata.repository;

import com.ayushjain.employeedata.entity.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
                                            //CrudRepository or JpaRepository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    public List<Employee> findByName(String name);
    public List<Employee> findByNameStartingWith(String pattern);
    public List<Employee> findByAgeBetween(int startAge, int endAge);
}
