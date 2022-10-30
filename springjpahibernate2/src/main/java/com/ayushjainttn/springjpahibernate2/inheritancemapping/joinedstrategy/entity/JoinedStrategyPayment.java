package com.ayushjainttn.springjpahibernate2.inheritancemapping.joinedstrategy.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@ToString
@Table(name = "payment")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class JoinedStrategyPayment {
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int paymentId;

    @NotNull
    @Column(name = "amount")
    private double paymentAmount;
}
