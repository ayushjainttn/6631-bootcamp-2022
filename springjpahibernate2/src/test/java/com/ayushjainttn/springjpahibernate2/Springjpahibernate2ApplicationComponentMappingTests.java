package com.ayushjainttn.springjpahibernate2;

import com.ayushjainttn.springjpahibernate2.componentmapping.entity.Employees;
import com.ayushjainttn.springjpahibernate2.componentmapping.entity.Salary;
import com.ayushjainttn.springjpahibernate2.componentmapping.repository.EmployeesRepository;
import com.ayushjainttn.springjpahibernate2.inheritancemapping.joinedstrategy.entity.JoinedStrategyCreditCard;
import com.ayushjainttn.springjpahibernate2.inheritancemapping.joinedstrategy.repository.JoinedStrategyPaymentRepository;
import com.ayushjainttn.springjpahibernate2.inheritancemapping.singlestrategy.entity.SingleTableStrategyCreditCard;
import com.ayushjainttn.springjpahibernate2.inheritancemapping.singlestrategy.repository.SingleTableStrategyPaymentRepository;
import com.ayushjainttn.springjpahibernate2.inheritancemapping.tableperclassstrategy.entity.TablePerClassStrategyCreditCard;
import com.ayushjainttn.springjpahibernate2.inheritancemapping.tableperclassstrategy.repository.TablePerClassStrategyPaymentRepository;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springjpahibernate2ApplicationComponentMappingTests {
	private final Logger log = LoggerFactory.getLogger(Springjpahibernate2ApplicationComponentMappingTests.class);
	@Autowired
	EmployeesRepository employeesRepository;
	@Test
	void contextLoads() {
		log.info("Connection Eastabilished Successfully");
	}

	@Test
	public void testAddEmployee(){
		Employees emp1 = new Employees();
		emp1.setFirstName("Ayush");
		emp1.setLastName("Jain");
		emp1.setAge(22);
		Salary sal = new Salary();
		sal.setBasicSalary(32500);
		sal.setBonusSalary(0);
		sal.setTaxAmount(1250);
		sal.setSpecialAllowanceSalary(3000);
		emp1.setSalary(sal);
		employeesRepository.save(emp1);
	}
}
