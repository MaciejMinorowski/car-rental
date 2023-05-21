package com.example.carrental.mapper;

import com.example.carrental.DTO.CustomerDTO;
import com.example.carrental.model.CustomerModel;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public CustomerModel customerDtoToCustomerModel(CustomerDTO customerDTO, CustomerModel customerModel){
        if (customerDTO.getFirstName() != null){
            customerModel.setFirstName(customerDTO.getFirstName());
        }
        if (customerDTO.getLastName() != null){
            customerModel.setLastName(customerDTO.getLastName());
        }
        if (customerDTO.getEmail() != null){
            customerModel.setEmail(customerDTO.getEmail());
        }
        if (customerDTO.getAddress() != null){
            customerModel.setAddress(customerDTO.getAddress());
        }
        if (customerDTO.getCarRentalModel() != null){
            customerModel.setCarRentalModel((customerDTO.getCarRentalModel()));
        }

        return customerModel;
    }
}
