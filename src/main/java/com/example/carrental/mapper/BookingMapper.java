package com.example.carrental.mapper;

import com.example.carrental.DTO.BookingDTO;
import com.example.carrental.model.BookingModel;
import org.springframework.stereotype.Component;

@Component
public class BookingMapper {


    public BookingModel bookingDTOToBookingModel(BookingDTO bookingDTO, BookingModel bookingModel) {


//        if (bookingDTO.getEmployeeId() != null) {  // EmployyeeMOdel
//            bookingModel.setEmployeeId((bookingDTO.getEmployeeId()));
//        }

//        if (bookingDTO.getReservationStartDate() != null) {
//            bookingModel.setReservationStartDate((bookingDTO.getReservationStartDate()));
//        }


//        if (bookingDTO.getReservationId() != null) {
//            bookingModel.setReservationId((bookingDTO.getReservationId()));
//        }

        if(bookingDTO.getComments() != null) {
            bookingModel.setComments(bookingDTO.getComments());
        }

        return bookingModel;


    }


}
