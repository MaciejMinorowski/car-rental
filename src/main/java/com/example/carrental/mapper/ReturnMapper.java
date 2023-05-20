package com.example.carrental.mapper;

import com.example.carrental.DTO.ReturnDTO;
import com.example.carrental.model.ReturnModel;
import org.springframework.stereotype.Component;

@Component
public class ReturnMapper {

    public ReturnModel returnDTOToReturnModel(ReturnDTO returnDTO, ReturnModel returnModel){

        if (returnDTO.getEmployeeModel() != null){
            returnModel.setEmployeeModel(returnDTO.getEmployeeModel());
        }
        if (returnDTO.getReturnDate() != null){
            returnModel.setReturnDate(returnDTO.getReturnDate());
        }
        if (returnDTO.getReservationModel() != null){
            returnModel.setReservationModel(returnDTO.getReservationModel());
        }
        if (returnDTO.getExtraCharge() != null){
            returnModel.setExtraCharge(returnDTO.getExtraCharge());
        }
        if (returnDTO.getComments() != null) {
            returnModel.setComments(returnDTO.getComments());
        }
        return returnModel;
    }

}
