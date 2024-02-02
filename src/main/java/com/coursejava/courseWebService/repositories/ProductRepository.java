package com.coursejava.courseWebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.courseWebService.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
