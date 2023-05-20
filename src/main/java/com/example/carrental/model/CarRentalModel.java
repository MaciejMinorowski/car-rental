package com.example.carrental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

import java.util.List;

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
    @OneToMany
    private List<EmployeeModel> employeeModelList;

    @Column
    private String logotype;

    @OneToMany(mappedBy = "carRentalModel")
    private List<CarModel> carModelList;

    @OneToMany (mappedBy = "")
    private List<DepartmentModel> departmentModelList;






}