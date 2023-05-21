package com.example.carrental.DTO;


import com.example.carrental.model.CarRentalModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CustomerDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private CarRentalModel carRentalModel;




}
