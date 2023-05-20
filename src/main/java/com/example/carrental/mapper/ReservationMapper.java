package com.example.carrental.mapper;

import com.example.carrental.DTO.ReservationDTO;
import com.example.carrental.model.CarModel;
import com.example.carrental.model.ReservationModel;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ReservationMapper {

    public ReservationModel reservationDTOToReservationModel(ReservationDTO reservationDTO, ReservationModel reservationModel) {

        if (reservationDTO.getReservationStartDate() != null) {
            reservationModel.setReservationStartDate((reservationDTO.getReservationStartDate()));
        }
        if (reservationDTO.getReservationEndDate() != null) {
            reservationModel.setReservationEndDate(reservationDTO.getReservationEndDate());
        }
        if (reservationDTO.getCustomerModel() != null) {
            reservationModel.setCustomerModel(reservationDTO.getCustomerModel());
        }
        if (reservationDTO.getCarModel() != null) {
            reservationModel.setCarModel(reservationDTO.getCarModel());
        }

        if (reservationDTO.getStartDepartmentModel() != null) {
            reservationModel.setStartDepartmentModel(reservationDTO.getStartDepartmentModel());
        }

        if (reservationDTO.getDestinationDepartmentModel() != null) {
            reservationModel.setDestinationDepartmentModel(reservationDTO.getDestinationDepartmentModel());
        }
        if (reservationDTO.getPrice() != null) {
            reservationModel.setPrice(reservationDTO.getPrice());
        }

        return reservationModel;
    }
}









