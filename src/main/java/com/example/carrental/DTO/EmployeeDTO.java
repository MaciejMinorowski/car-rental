package com.example.carrental.DTO;

import com.example.carrental.model.DepartmentModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;



@AllArgsConstructor
@Setter
@Getter
public class EmployeeDTO {

    private String firstName;
    private String lastName;
    private Boolean isManager;
    private DepartmentModel departmentModel;





}
