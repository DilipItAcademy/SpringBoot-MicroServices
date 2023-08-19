package com.swiggy.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swiggy.food.entity.Payments;

@Repository
public interface PaymentRepository extends JpaRepository<Payments, Integer>{

}
