package com.example.carrental.controller;

import com.example.carrental.model.CarModel;
import com.example.carrental.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    public CarModel getCars() {
    return new CarModel(1L, "sdsad", "sadasd", "asdasd", "sadas",123, 21312,123, List.of(), null);
    }

    @PostMapping
    public void addCar(@RequestBody CarModel carModel) {
        carService.addCar(carModel);
        System.out.println(carModel);
    }


}
