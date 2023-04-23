package com.example.carrental.service;

import com.example.carrental.model.CarModel;
import com.example.carrental.model.CarStatus;
import com.example.carrental.model.CarStatusHistoryModel;
import com.example.carrental.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public void addCar(CarModel carModel) {
        carRepository.save(carModel);
    }

    public void deleteCar(Long id){
        carRepository.deleteById(id);
    }


    public void increaseMileage(int kilometersDoneSinceLastUpdate, CarModel carModel){
        carModel.setMileage(carModel.getMileage() + kilometersDoneSinceLastUpdate);
    }

    public void editMileage(int newMileage, CarModel carModel) {
        carModel.setMileage(newMileage);
    }

    public void editPricePerDay(int newPricePerDay, CarModel carModel) {
        carModel.setPricePerDay(newPricePerDay);
    }

    public CarStatus getCarStatusOnGivenDay(LocalDate date, CarModel carModel) {
        List<CarStatusHistoryModel> statusHistoryModelsOfAGivenCar = carModel.getCarStatusHistoryModels();
        for(CarStatusHistoryModel statusHistoryModelsOfAGivenCarRecord: statusHistoryModelsOfAGivenCar) {
            if(date.isAfter(statusHistoryModelsOfAGivenCarRecord.getStartDate())  &&  date.isAfter(statusHistoryModelsOfAGivenCarRecord.getEndDate())){
            return statusHistoryModelsOfAGivenCarRecord.getCarStatus();
        }

        }
        return CarStatus.AVAILABLE;
    }

    public List<CarModel> getAllCars() {
        return carRepository.findAll();
    }

}
