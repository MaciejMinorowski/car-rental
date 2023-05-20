package com.example.carrental.mapper;

import com.example.carrental.DTO.CarRentalDTO;
import com.example.carrental.model.CarRentalModel;
import org.springframework.stereotype.Component;

@Component
public class CarRentalMapper {

    public CarRentalModel carRentalDTOToCarRentalModel (CarRentalDTO carRentalDTO, CarRentalModel carRentalModel) {

    if (carRentalDTO.getName() != null) {
        carRentalModel.setName(carRentalDTO.getName());
    }

    if (carRentalDTO.getAddress() != null) {
        carRentalModel.setAddress(carRentalDTO.getAddress());
    }


    if (carRentalDTO.getDomain() != null) {
        carRentalModel.setDomain(carRentalDTO.getDomain());
    }

    if (carRentalDTO.getLogotype() != null) {
        carRentalModel.setLogotype(carRentalDTO.getLogotype());
    }

    return carRentalModel;

    }
}
