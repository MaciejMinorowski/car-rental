package com.example.carrental.controller;

import com.example.carrental.model.CarModel;
import com.example.carrental.model.CarStatus;
import com.example.carrental.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(value = "/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping
    public List<CarModel> getCars() {
//    return new CarModel(1L, "sdsad", "sadasd", "asdasd", "sadas",123, 21312,123, List.of(), null); // sprawdzenie
        return carService.getAllCars();
    }

    @PostMapping
    public void addCar(@RequestBody CarModel carModel) {
        carService.addCar(carModel);
//        System.out.println(carModel); //tu sobie sprawdzamy
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable("id") Long id) {
        carService.deleteCar(id);
    }

    @PostMapping("/mileage/add/{id}")
    public void addCarMileage(@PathVariable("id") Long id, Model model, int mileage) {
    CarModel carModel = carService.getCarModelById(id);
    carService.increaseMileage(mileage, carModel);
    }

    @PostMapping("/mileage/edit/{id}")
    public void editCarMileage(@PathVariable("id") Long id, Model model, int mileage) {
        CarModel carModel = carService.getCarModelById(id);
        carService.editMileage(mileage, carModel);
    }

    @PostMapping("/price/edit/{id}")
    public void editCarPricePerDay(@PathVariable("id") Long id, Model model, int pricePerDay) {
        CarModel carModel = carService.getCarModelById(id);
        carService.editPricePerDay(pricePerDay, carModel);
    }

    @GetMapping("/status/{id}")
    public CarStatus getCarStatusOnAGivenDay(@PathVariable("id") Long id, LocalDate localDate){
        CarModel carModel = carService.getCarModelById(id);
        return carService.getCarStatusOnGivenDay(localDate, carModel);
    }

}
