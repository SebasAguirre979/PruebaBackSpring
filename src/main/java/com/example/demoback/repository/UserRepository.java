package com.example.demoback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoback.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
