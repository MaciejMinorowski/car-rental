package com.example.carrental.model;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reservation_booking_date")
    private LocalDate reservationBookingDate;

    @Column(name = "reservation_start_date")
    private LocalDate reservationStartDate;

    @Column(name = "reservation_end_date")
    private LocalDate reservationEndDate;

    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "customer_model_id")
    private CustomerModel customerModel;

    @OneToOne
    @JoinColumn(name = "car_model_id")
    private CarModel carModel;

    @OneToOne
    @JoinColumn(name = "start_department_id")
    private DepartmentModel startDepartmentModel;  // czy odwołuję się do CarModel?  nazwa zmiennej?


    @OneToOne
    @JoinColumn(name = "destination_department_model_id")
    private DepartmentModel destinationDepartmentModel;


    @OneToOne
    private BookingModel bookingModel;


    @OneToOne
    private ReturnModel returnModel;



}
