package com.example.carrental.mapper;

import com.example.carrental.DTO.BookingDTO;
import com.example.carrental.model.BookingModel;
import org.springframework.stereotype.Component;

@Component
public class BookingMapper {


    public BookingModel bookingDTOToBookingModel(BookingDTO bookingDTO, BookingModel bookingModel) {


        if (bookingDTO.getEmployeeModel() != null) {
            bookingModel.setEmployeeModel(bookingDTO.getEmployeeModel());
        }

        if (bookingDTO.getBookingStartDay() != null) {
            bookingModel.setBookingStartDay(bookingDTO.getBookingStartDay());
        }

        if (bookingDTO.getComments() != null) {
            bookingModel.setComments(bookingDTO.getComments());
        }

        return bookingModel;


    }


}
