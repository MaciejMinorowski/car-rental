package com.example.carrental.repository;

import com.example.carrental.model.CarStatusHistoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarStatusHistoryRepository extends JpaRepository<CarStatusHistoryModel, Long> {

//    @Query("select c from CarStatusHistoryModel  c where c.endDate > CURRENT DATE")
//    List<CarStatusHistoryModel> findAllCarStatusHistoryModelsInTheFuture();

}
