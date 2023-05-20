package com.example.carrental.service;

import com.example.carrental.mapper.ReservationMapper;
import com.example.carrental.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationService {


    private final ReservationRepository reservationRepository;

    private final ReservationMapper reservationMapper;


    // TODO
    // logika
}
