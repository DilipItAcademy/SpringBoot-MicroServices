package com.swiggy.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swiggy.food.entity.Order;

public interface OrderRepository extends JpaRepository<Order, String>{

}
