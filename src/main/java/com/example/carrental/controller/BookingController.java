package com.example.carrental.controller;

import com.example.carrental.DTO.BookingDTO;
import com.example.carrental.model.BookingModel;
import com.example.carrental.service.BookingService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
public class BookingController {


    private final BookingService bookingService;

    @GetMapping
    public List<BookingModel> getBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping
    public void addBooking(@RequestBody BookingDTO bookingDTO) {
        bookingService.addBooking(bookingDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteBookingById(@PathVariable("id") Long id) {
        bookingService.deleteBooking(id);
    }

    @PostMapping("/edit/{id}")
    public void editBooking(@PathVariable("id") Long id, @RequestBody BookingDTO bookingDTO) {
        BookingModel bookingModel = bookingService.getBookingModelById(id);
        bookingService.editBooking(bookingDTO, bookingModel);
    }


}
