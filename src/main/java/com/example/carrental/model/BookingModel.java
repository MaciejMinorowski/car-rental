package com.example.carrental.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne(mappedBy = "employee_model")
    @JoinColumn
    private EmployeeModel employeeModel; // czy odwołuję się do CarModel?  nazwa zmiennej?


    @OneToOne(mappedBy = "reservation_start_date")
    @JoinColumn
    private ReservationModel reservationModelStartDate;  // czy odwołuję się do CarModel?  nazwa zmiennej?



    @Column(name = "reservation_id")
    private ReservationModel reservationId; // czy odwołuję się do CarModel?  nazwa zmiennej?


    @Column(name = "comments")
    private String comments;


}
