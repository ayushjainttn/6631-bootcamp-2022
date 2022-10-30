package com.ayushjainttn.springjpahibernate2.inheritancemapping.joinedstrategy.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "cheque")
@PrimaryKeyJoinColumn(name = "id")
public class JoinedStrategyCheque extends JoinedStrategyPayment{
    @Column(name = "chequenumber")
    private String chequeNumber;
}
