package com.example.carrental.DTO;

import com.example.carrental.model.CarModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ReservationDTO {


   // private Long id;  - tego nie chcemy edytować
  //  private Date reservationBookingDate; // tego nie chcemy edytować
    private Date reservationStartDate;
    private Date reservationEndDate;
    private CarModel carModelId;   // czy odwołuję się do CarModel?  nazwa zmiennej?
    private Department startDepartmentId;  // nazwa zmiennej?
    private Department destinationDepartmentId;  // nazwa zmiennej?
    private Double price;


}
