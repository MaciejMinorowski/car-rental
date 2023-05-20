package com.example.carrental.controller;

import com.example.carrental.DTO.CarDTO;
import com.example.carrental.DTO.ReservationDTO;
import com.example.carrental.model.CarModel;
import com.example.carrental.model.CarStatus;
import com.example.carrental.model.ReservationModel;
import com.example.carrental.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "reservation")
public class ReservationController {



    private final ReservationService reservationService;

    @GetMapping
    public List<ReservationModel> getReservations() {
        return reservationService.getAllReservation();
    }


    @PostMapping
    public void addReservation(@RequestBody ReservationDTO reservationDTO) {
        reservationService.addReservation(reservationDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteReservationById(@PathVariable("id") Long id) {
        reservationService.deleteReservation(id);
    }

//
//    @PostMapping("/edit/{id}")
//    public void editReservation(@PathVariable("id") Long id, @RequestBody ReservationDTO reservationDTO){
//        ReservationModel reservationModel = reservationService.
//
//    }





}
