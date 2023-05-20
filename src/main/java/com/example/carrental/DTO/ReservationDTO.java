package com.example.carrental.DTO;

import com.example.carrental.model.CarModel;
import com.example.carrental.model.CustomerModel;
import com.example.carrental.model.DepartmentModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ReservationDTO {

    private LocalDate reservationBookingDate;
    private LocalDate reservationStartDate;
    private LocalDate reservationEndDate;
    private CustomerModel customerModel;
    private CarModel carModel;
    private DepartmentModel startDepartmentModel;
    private DepartmentModel destinationDepartmentModel;
    private Double price;


}
