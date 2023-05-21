package com.example.carrental.service;

import com.example.carrental.DTO.BookingDTO;
import com.example.carrental.mapper.BookingMapper;
import com.example.carrental.model.BookingModel;
import com.example.carrental.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository bookingRepository;

    private final BookingMapper bookingMapper;

    public void addBooking(BookingDTO bookingDTO) {
        BookingModel newBooking = new BookingModel();
        bookingMapper.bookingDTOToBookingModel(bookingDTO, newBooking);
        bookingRepository.save(newBooking);
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }


    public void editBooking(BookingDTO bookingDTO, BookingModel editedBookingModel) {
        bookingMapper.bookingDTOToBookingModel(bookingDTO, editedBookingModel);
        bookingRepository.save(editedBookingModel);
    }


    public List<BookingModel> getAllBookings() {
        return bookingRepository.findAll();
    }

    public BookingModel getBookingModelById(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }


}
