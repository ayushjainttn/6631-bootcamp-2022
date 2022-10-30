package com.ayushjainttn.springjpahibernate2.inheritancemapping.singlestrategy.repository;

import com.ayushjainttn.springjpahibernate2.inheritancemapping.singlestrategy.entity.SingleTableStrategyPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SingleTableStrategyPaymentRepository extends JpaRepository<SingleTableStrategyPayment, Integer> {
}
