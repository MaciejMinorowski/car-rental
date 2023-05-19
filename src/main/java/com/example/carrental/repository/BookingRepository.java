package com.example.carrental.repository;

import com.example.carrental.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingModel,Long> {


}
