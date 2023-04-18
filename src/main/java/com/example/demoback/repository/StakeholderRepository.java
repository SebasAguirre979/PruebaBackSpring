package com.example.demoback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoback.model.Stakeholder;

public interface StakeholderRepository extends JpaRepository<Stakeholder, Long>{
    
}
