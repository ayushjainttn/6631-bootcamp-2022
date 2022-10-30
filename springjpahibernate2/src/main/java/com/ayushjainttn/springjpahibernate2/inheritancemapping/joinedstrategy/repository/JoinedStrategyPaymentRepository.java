package com.ayushjainttn.springjpahibernate2.inheritancemapping.joinedstrategy.repository;

import com.ayushjainttn.springjpahibernate2.inheritancemapping.joinedstrategy.entity.JoinedStrategyPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoinedStrategyPaymentRepository extends JpaRepository<JoinedStrategyPayment,Integer> {
}
