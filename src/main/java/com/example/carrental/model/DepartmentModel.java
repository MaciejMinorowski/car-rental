package com.example.carrental.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "department_address")
    private String departmentAddress;

    @OneToMany(mappedBy = "departmentModel")
    private Set<EmployeeModel> employeeModels;

    @ManyToOne
    @JoinColumn(name = "car_rental_id")
    private CarRentalModel carRentalModel;
}

