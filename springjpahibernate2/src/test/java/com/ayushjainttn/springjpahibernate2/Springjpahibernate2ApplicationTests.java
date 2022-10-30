package com.ayushjainttn.springjpahibernate2;

import com.ayushjainttn.springjpahibernate2.entity.Employee;
import com.ayushjainttn.springjpahibernate2.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springjpahibernate2ApplicationTests {
	private final Logger log = LoggerFactory.getLogger(Springjpahibernate2ApplicationTests.class);
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
		log.info("Connection Eastabilished Successfully");
	}

	@Test
	public void testAddEmployees(){
		Employee emp1 = new Employee();
		emp1.setFirstName("Himanshi");
		emp1.setLastName("Khurana");
		emp1.setAge(24);
		emp1.setSalary(38790);
		employeeRepository.save(emp1);
	}

	@Test
	public void testFindEmployeesBySalaryGreaterThanAvgSalary(){
		List<Object[]> empList = employeeRepository.findEmployeeBySalaryGreaterThanAverageSalary();
		empList.forEach(employee-> System.out.println(employee[0]+" "+employee[1]));
	}
}
