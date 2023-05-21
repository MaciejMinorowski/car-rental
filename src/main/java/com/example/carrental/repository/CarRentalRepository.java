package com.example.carrental.repository;

import com.example.carrental.model.CarRentalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRentalRepository extends JpaRepository<CarRentalModel, Long> {
}
