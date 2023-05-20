package com.example.carrental.DTO;

import com.example.carrental.model.EmployeeModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CarRentalDTO {

    private String name;

    private String domain;

    private String address;

    private EmployeeModel admin;

    private EmployeeModel owner;

    private String logotype;

}
