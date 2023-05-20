package com.example.carrental.mapper;

import com.example.carrental.DTO.EmployeeDTO;
import com.example.carrental.model.EmployeeModel;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public EmployeeModel employeeDTOTOEmployeeModel(EmployeeDTO employeeDTO, EmployeeModel employeeModel){
        if (employeeDTO.getFirstName() != null){
            employeeModel.setFirstName(employeeDTO.getFirstName());
        }
        if (employeeDTO.getLastName() != null){
            employeeModel.setLastName(employeeDTO.getLastName());
        }
        if (employeeDTO.getDepartmentModel() != null){
            employeeModel.setDepartmentModel(employeeDTO.getDepartmentModel());
        }
        if (employeeDTO.getIsManager() != null) {
            employeeModel.setIsManager(employeeDTO.getIsManager());
        }

        return employeeModel;
    }
}
