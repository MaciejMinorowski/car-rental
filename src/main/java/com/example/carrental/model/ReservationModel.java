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
@Data
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

    @OneToOne
    @JoinColumn(name = "customer_model")
    private CustomerModel customerModel;

    @OneToOne
    @JoinColumn(name = "car_model")
    private CarModel carModel;

    @OneToOne
    @JoinColumn(name = "start_department")
    private DepartmentModel startDepartmentModel;  // czy odwołuję się do CarModel?  nazwa zmiennej?


    @OneToOne
    @JoinColumn(name = "destination_department_model")
    private DepartmentModel destinationDepartmentModel;  // czy odwołuję się do CarModel?  nazwa zmiennej?

    @Column(name = "price")
    private Double price;


}
