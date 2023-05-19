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


    //TODO
    // sprawdzić   notnul i autoincrement

             //Employee id NotNull autoincrement

    //@Column(name = "employee_id")
    //private Employee employeeID;


             //Reservation_startDAte datetime Notnull

    //    @Column (name = "reservation_start_date")
    //    private Reservation reservationStartDate;


            //reservation-Id Not Null autoincrement

    //    @Column (name = reservation_id)
    //    private Reservation reservationId;



@Column(name = "comments")
private String comments;


}
