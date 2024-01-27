package com.coursejava.courseWebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.courseWebService.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
