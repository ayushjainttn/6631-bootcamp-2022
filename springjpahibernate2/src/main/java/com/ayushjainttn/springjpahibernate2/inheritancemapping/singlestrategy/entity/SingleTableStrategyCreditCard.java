package com.ayushjainttn.springjpahibernate2.inheritancemapping.singlestrategy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("cc")
public class SingleTableStrategyCreditCard extends SingleTableStrategyPayment {
    @Column(name = "creditcardnumber")
    private String creditCardNumber;
}
