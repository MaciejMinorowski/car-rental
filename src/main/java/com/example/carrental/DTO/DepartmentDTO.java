package com.example.carrental.DTO;

import com.example.carrental.model.CarRentalModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@AllArgsConstructor
public class DepartmentDTO {


    private String departmentAddress;
    private CarRentalModel carRentalModel;


}
