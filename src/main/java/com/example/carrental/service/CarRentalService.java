package com.example.carrental.service;

import com.example.carrental.DTO.CarRentalDTO;
import com.example.carrental.mapper.CarRentalMapper;
import com.example.carrental.model.CarRentalModel;
import com.example.carrental.repository.CarRentalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarRentalService {

    private final CarRentalRepository carRentalRepository;
    private final CarRentalMapper carRentalMapper;

    public void addCarRental(CarRentalDTO carRentalDTO) {
        CarRentalModel newCarRentalModel = new CarRentalModel();
        carRentalMapper.carRentalDTOToCarRentalModel(carRentalDTO, newCarRentalModel);
        carRentalRepository.save(newCarRentalModel);
    }

    public void deleteCarRental(Long id) {
        carRentalRepository.deleteById(id);
    }

    public void editCarRental(CarRentalDTO carRentalDTO, CarRentalModel carRentalModel) {
        carRentalMapper.carRentalDTOToCarRentalModel(carRentalDTO, carRentalModel);
    }

    public CarRentalModel getCarRentalModelById(Long id) {
        return carRentalRepository.findById(id).orElse(null);
    }

    public List<CarRentalModel> getAllCarRentalModels() {
        return carRentalRepository.findAll();
    }
}
