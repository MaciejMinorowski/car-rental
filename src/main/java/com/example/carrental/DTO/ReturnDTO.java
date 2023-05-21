package com.example.carrental.DTO;

import com.example.carrental.model.EmployeeModel;
import com.example.carrental.model.ReservationModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
public class ReturnDTO {


    private EmployeeModel employeeModel;
    private LocalDate returnDate;
    private ReservationModel reservationModel;
    private Integer extraCharge;
    private String comments;

}
