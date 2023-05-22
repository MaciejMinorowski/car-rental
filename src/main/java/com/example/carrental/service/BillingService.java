package com.example.carrental.service;

import com.example.carrental.model.CarModel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BillingService {

    public Double getInitialCost(CarModel carModel, LocalDate startDay, LocalDate endDate) {
        double numberOfDays = (double) ChronoUnit.DAYS.between(endDate, startDay);
        return carModel.getPricePerDay() * numberOfDays;
    }



}
