package com.example.carrental.service;

import com.example.carrental.mapper.BookingMapper;
import com.example.carrental.model.BookingModel;
import com.example.carrental.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {

    private  final BookingRepository bookingRepository;

    private  final BookingMapper bookingMapper;

    // TO DO

//    public void addBooking (BookingDTO bookingDTO) {
//        BookingModel newBooking = new BookingModel();
//    }
}
