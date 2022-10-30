package com.ayushjainttn.springjpahibernate2.inheritancemapping.joinedstrategy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "creditcard")
@PrimaryKeyJoinColumn(name = "id")
public class JoinedStrategyCreditCard extends JoinedStrategyPayment{
    @Column(name = "creditcardnumber")
    private String creditCardNumber;
}
