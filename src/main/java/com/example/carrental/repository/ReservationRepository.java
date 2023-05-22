package com.example.carrental.repository;

import com.example.carrental.model.ReservationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationModel,Long> {

    @Query("Select ReservationModel from ReservationModel r where r.customerModel.id = :id")
    public List<ReservationModel> getReservationModelByCustomerId(@Param("id") Long id);

    @Query("Select ReservationModel from ReservationModel r where r.id = :id")
    public ReservationModel getReservationModelById(@Param("id") Long id);



}
