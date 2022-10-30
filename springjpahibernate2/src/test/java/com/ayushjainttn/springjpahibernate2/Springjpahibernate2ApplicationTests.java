package com.ayushjainttn.springjpahibernate2;

import com.ayushjainttn.springjpahibernate2.nativesqlandjpql.entity.Employee;
import com.ayushjainttn.springjpahibernate2.nativesqlandjpql.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

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
		emp1.setFirstName("Harsh");
		emp1.setLastName("Nayan");
		emp1.setAge(48);
		emp1.setSalary(50283);
		employeeRepository.save(emp1);
	}

	@Test
	public void testFindEmployeesBySalaryGreaterThanAvgSalary(){
		List<Object[]> empAvgSalList = employeeRepository.findEmployeeAvgSalary();
		List<Object[]> empList = employeeRepository.findEmployeeBySalaryGreaterThanAvgSalary((Double)empAvgSalList.get(0)[0]);
		empList.forEach(employee-> System.out.println(employee[0]+" "+employee[1]));
	}

	@Test
	@Transactional
	@Rollback(false)
	public void testUpdateEmployeeSalaryIfSalaryLessThanAvgSalary(){
		List<Object[]> empAvgSalList = employeeRepository.findEmployeeAvgSalary();
		employeeRepository.updateEmployeeSalaryIfSalaryLessThanAvgSalary(10000, (Double) empAvgSalList.get(0)[0]);
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testDeleteEmployeesWithMinSalary(){
		List<Object[]> empMinSalary = employeeRepository.findEmployeesWithMinSalary();
		employeeRepository.deleteEmployeesWithMinSalary((Double)empMinSalary.get(0)[0]);
	}

	@Test
	public void testFindEmployeeWithLastName(){
		List<Object[]> empList = employeeRepository.findEmployeesWithLastName("Singh");
		empList.forEach(employee-> System.out.println(employee[0]+" "+employee[1]+" "+employee[2]));
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testDeleteEmployeeWithAgeGreaterThan(){
		employeeRepository.deleteEmployeesWithAgeGreaterThan(45);
	}
}
