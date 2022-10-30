package com.ayushjainttn.springjpahibernate2.nativesqlandjpql.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "employeeTable")
public class Employee {
    @Column(name = "empId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "empFirstName")
    private String firstName;
    @Column(name = "empLastName")
    private String lastName;
    @Column(name = "empSalary")
    private double salary;
    @Column(name = "empAge")
    private int age;
}
