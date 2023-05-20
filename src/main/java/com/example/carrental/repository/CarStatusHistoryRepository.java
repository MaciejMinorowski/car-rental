package com.example.carrental.repository;

import com.example.carrental.model.CarStatusHistoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarStatusHistoryRepository extends JpaRepository<CarStatusHistoryModel, Long> {
}
