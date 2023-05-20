package com.example.carrental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CarRentalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String domain;

    @Column
    private String address;

    @Column
    private EmployeeModel admin;

    @Column
    private EmployeeModel owner;

    @Column
    private String logotype;

    @OneToMany
    private CarModel carModel;

    @OneToMany (mappedBy = "")
    private DepartmentModel departmentModel;






}