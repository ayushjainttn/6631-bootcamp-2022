package com.ayushjainttn.springjpahibernate2.componentmapping.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
@Getter
@Setter
public class Salary {
    @NotNull
    @Column(name = "basicsalary")
    private double basicSalary;
    @Column(name = "bonussalary")
    private double bonusSalary;
    @Column(name = "taxamount")
    private double taxAmount;
    @Column(name = "specialallowancesalary")
    private double specialAllowanceSalary;
}
