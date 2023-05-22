package com.example.carrental.repository;

import com.example.carrental.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {

    @Query("select CustomerModel from CustomerModel c where c.id=:id")
    public CustomerModel customerModelById(@Param("id") Long id);



}
