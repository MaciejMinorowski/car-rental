package com.example.carrental.DTO;


import com.example.carrental.model.ReservationModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BookingDTO {


    // Check -  dajemy tu tylko pola, które pozwalamy edytować???
    //private Long id;

    private EmployeeModel employeeModel; // czy odwołuję się do CarModel?  nazwa zmiennej?

    private ReservationModel reservationModelStartDate;  // czy odwołuję się do CarModel?  nazwa zmiennej?

    private ReservationModel reservationId; // czy odwołuję się do CarModel?  nazwa zmiennej?

    private String comments;


