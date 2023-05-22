package com.example.carrental.service;

import com.example.carrental.DTO.ReservationDTO;
import com.example.carrental.mapper.ReservationMapper;
import com.example.carrental.model.CarModel;
import com.example.carrental.model.ReservationModel;
import com.example.carrental.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReservationService {


    private final ReservationRepository reservationRepository;

    private final ReservationMapper reservationMapper;

    public void addReservation(ReservationDTO reservationDTO) {
        ReservationModel newReservation = new ReservationModel();
        reservationMapper.reservationDTOToReservationModel(reservationDTO, newReservation);
        reservationRepository.save(newReservation);
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    public void editReservation(ReservationDTO reservationDTO, ReservationModel editedReservationModel) {
        reservationMapper.reservationDTOToReservationModel(reservationDTO, editedReservationModel);
        reservationRepository.save(editedReservationModel);
    }

    public List<ReservationModel> getAllReservation() {
        return reservationRepository.findAll();
    }

    public List<ReservationModel> getAllReservationOfAGivenCar (CarModel carModel) {
        List<ReservationModel> allReservationOfAGivenCar = getAllReservation().stream()
                .filter(reservationModel -> reservationModel.getCarModel().getId() == carModel.getId())
                .collect(Collectors.toList());
        return allReservationOfAGivenCar;
    }



}


