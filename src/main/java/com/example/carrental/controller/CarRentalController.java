package com.example.carrental.controller;

import com.example.carrental.DTO.CarRentalDTO;
import com.example.carrental.model.CarRentalModel;
import com.example.carrental.service.CarRentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrental")
@RequiredArgsConstructor
public class CarRentalController {

    private final CarRentalService carRentalService;

    @GetMapping
    public List<CarRentalModel> getAllCarRentalModels() {
        return carRentalService.getAllCarRentalModels();
    }

    @GetMapping("/{id}")
    public CarRentalModel getCarRentalModelById(Long id){
        return carRentalService.getCarRentalModelById(id);
    }

    @PostMapping
    public void addCarRental(@RequestBody CarRentalDTO carRentalDTO) {
        carRentalService.addCarRental(carRentalDTO);
    }

    @PostMapping("/edit/{id}")
    public void editCarRental(@RequestBody CarRentalDTO carRentalDTO, @PathVariable Long id){
        CarRentalModel carRentalModel = carRentalService.getCarRentalModelById(id);
        carRentalService.editCarRental(carRentalDTO,carRentalModel);
    }

    @DeleteMapping("/{id}")
    public void deleteCarRental(@PathVariable Long id){
        carRentalService.deleteCarRental(id);
    }



}
