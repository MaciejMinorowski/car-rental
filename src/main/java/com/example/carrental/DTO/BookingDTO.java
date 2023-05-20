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
public class BookingDTO {


    private String comments;

    private EmployeeModel employeeModel;

    private LocalDate bookingStartDay;




}