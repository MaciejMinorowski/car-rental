package com.example.carrental.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name="model")
    private String model;

    @Column(name = "body_type")
    private String bodyType;

    @Column(name = "color")
    private String color;

    @Column(name = "year_of_production")
    private int yearOfProduction;

    @Column(name="mileage")
    private int mileage;

    @Column(name = "price_per_day")
    private double pricePerDay;

    @OneToMany
    private List<CarStatusHistoryModel> carStatusHistoryModels;

    @ManyToOne
    @JoinColumn(name = "car_rental_id")
    private CarRentalModel carRental;

}
