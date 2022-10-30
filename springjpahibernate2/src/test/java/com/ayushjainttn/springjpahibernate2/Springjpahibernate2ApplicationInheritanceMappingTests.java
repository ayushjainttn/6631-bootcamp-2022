package com.ayushjainttn.springjpahibernate2;

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
class Springjpahibernate2ApplicationInheritanceMappingTests {
	private final Logger log = LoggerFactory.getLogger(Springjpahibernate2ApplicationInheritanceMappingTests.class);
	@Autowired
	SingleTableStrategyPaymentRepository singleTableStrategyPaymentRepository;

	@Autowired
	TablePerClassStrategyPaymentRepository tablePerClassStrategyPaymentRepository;

	@Autowired
	JoinedStrategyPaymentRepository joinedStrategyPaymentRepository;

	@Test
	void contextLoads() {
		log.info("Connection Eastabilished Successfully");
	}

	@Test
	public void testCreatePaymentSingleStrategy(){
		SingleTableStrategyCreditCard singleTableStrategyCreditCard = new SingleTableStrategyCreditCard();
		singleTableStrategyCreditCard.setCreditCardNumber("7654321");
		singleTableStrategyCreditCard.setPaymentAmount(35490);
		singleTableStrategyPaymentRepository.save(singleTableStrategyCreditCard);
	}

	@Test
	public void testCeatePaymentTablePerClassStrategy(){
		TablePerClassStrategyCreditCard tablePerClassStrategyCreditCard = new TablePerClassStrategyCreditCard();
		tablePerClassStrategyCreditCard.setCreditCardNumber("7654321");
		tablePerClassStrategyCreditCard.setPaymentAmount(35490);
		tablePerClassStrategyPaymentRepository.save(tablePerClassStrategyCreditCard);
	}

	@Test
	public void testCreatePaymentJoinedStrategy(){
		JoinedStrategyCreditCard joinedStrategyCreditCard = new JoinedStrategyCreditCard();
		joinedStrategyCreditCard.setCreditCardNumber("7654321");
		joinedStrategyCreditCard.setPaymentAmount(35490);
		joinedStrategyPaymentRepository.save(joinedStrategyCreditCard);
	}
}
