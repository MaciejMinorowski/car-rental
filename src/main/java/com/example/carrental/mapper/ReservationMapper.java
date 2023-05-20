package com.example.carrental.mapper;

import com.example.carrental.DTO.ReservationDTO;
import com.example.carrental.model.CarModel;
import com.example.carrental.model.ReservationModel;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ReservationMapper {

    public ReservationModel reservationDTOToReservationModel(ReservationDTO reservationDTO, ReservationModel reservationModel){

        if (reservationDTO.getReservationStartDate() != null){
            reservationModel.setReservationStartDate((reservationDTO.getReservationStartDate()));
        }
        if (reservationDTO.getReservationEndDate() != null){
            reservationModel.setReservationEndDate(reservationDTO.getReservationEndDate());
        }
        if (reservationDTO.getCarModelId() != null){
            reservationModel.setCarModelId(reservationDTO.getCarModelId());
        }
        if (reservationDTO.getStartDepartmentId() != null){
            reservationModel.setStartDeparmentId(reservationDTO.getStartDepartmentId());
        }
        if (reservationDTO.getDestinationDepartmentId()) != null){
            reservationModel.setDestinationDepartmentId(reservationDTO.getDestinationDepartmentId());
        }
        if (reservationDTO.getPrice() != null){
            reservationModel.setPrice(reservationDTO.getPrice());



//       // private Date reservationStartDate;
//        private Date reservationEndDate;
//        private CarModel carModelId;   // czy odwołuję się do CarModel?  nazwa zmiennej?
//        private Department startDeparmentId;  // nazwa zmiennej?
//        private Department destinationDepartmentId;  // nazwa zmiennej?
//        private Double price;

    }


}
