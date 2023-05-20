package com.example.carrental.model;

import jakarta.persistence.*;
import lombok.*;


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
    private Date reservationBookingDate;

    @Column(name = "reservation_start_date")
    private Date reservationStartDate;

    @Column(name = "reservation_end_date")
    private Date reservationEndDate;

    @OneToOne(mappedBy = "customer_id")
    @JoinColumn
    private CustomerModel customerId; // czy odwołuję się do CarModel?  nazwa zmiennej?

    @OneToOne(mappedBy = "car_model_id")
    @JoinColumn
    private CarModel carModelId; // czy odwołuję się do CarModel?  nazwa zmiennej?

    @OneToOne(mappedBy = "start_deparment_id")
    @JoinColumn
    private DepartmentModel startDeparmentId;  // czy odwołuję się do CarModel?  nazwa zmiennej?


    @OneToOne(mappedBy = "destination_department_id")
    @JoinColumn
    private DepartmentModel destinationDepartmentId;  // czy odwołuję się do CarModel?  nazwa zmiennej?

    @Column(name = "price")
    private Double price;


}
