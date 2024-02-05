package com.coursejava.courseWebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.courseWebService.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
