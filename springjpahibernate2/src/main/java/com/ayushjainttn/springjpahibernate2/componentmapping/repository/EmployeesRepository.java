package com.ayushjainttn.springjpahibernate2.componentmapping.repository;

import com.ayushjainttn.springjpahibernate2.componentmapping.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
}
