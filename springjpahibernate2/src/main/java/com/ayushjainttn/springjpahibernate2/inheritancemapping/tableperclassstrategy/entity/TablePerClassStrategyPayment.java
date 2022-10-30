package com.ayushjainttn.springjpahibernate2.inheritancemapping.tableperclassstrategy.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@ToString
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class TablePerClassStrategyPayment {
    @NotNull
    @Id
    @Column(name = "id")
    private int paymentId;

    @NotNull
    @Column(name = "amount")
    private double paymentAmount;
}
