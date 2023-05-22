package com.example.carrental.repository;

import com.example.carrental.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Long> {

//    @Query("select * from CarModel c where c.carStatusHistoryModels ")

}