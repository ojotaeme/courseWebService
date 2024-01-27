package com.coursejava.courseWebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.courseWebService.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
