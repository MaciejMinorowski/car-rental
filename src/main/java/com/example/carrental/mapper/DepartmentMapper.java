package com.example.carrental.mapper;

import com.example.carrental.DTO.DepartmentDTO;
import com.example.carrental.model.DepartmentModel;
import org.springframework.stereotype.Component;


@Component
public class DepartmentMapper {

    public DepartmentModel departmentDTOToDepartmentModel(DepartmentDTO departmentDTO, DepartmentModel departmentModel){
        if (departmentDTO.getDepartmentAddress() != null){
            departmentModel.setDepartmentAddress(departmentDTO.getDepartmentAddress());
        }
        if (departmentDTO.getCarRentalModel() != null){
            departmentModel.setCarRentalModel(departmentDTO.getCarRentalModel());
        }

        return departmentModel;

    }
}
