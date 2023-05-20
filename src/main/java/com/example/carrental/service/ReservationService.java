package com.example.carrental.service;

import com.example.carrental.DTO.ReservationDTO;
import com.example.carrental.mapper.ReservationMapper;
import com.example.carrental.model.ReservationModel;
import com.example.carrental.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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


}


