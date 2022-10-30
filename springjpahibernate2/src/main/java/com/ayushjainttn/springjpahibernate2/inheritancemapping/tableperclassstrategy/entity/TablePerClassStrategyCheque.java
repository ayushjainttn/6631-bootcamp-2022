package com.ayushjainttn.springjpahibernate2.inheritancemapping.tableperclassstrategy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name = "chequeTable")
public class TablePerClassStrategyCheque extends TablePerClassStrategyPayment {
    @NotNull
    @Column(name = "chequenumber")
    private String chequeNumber;
}
