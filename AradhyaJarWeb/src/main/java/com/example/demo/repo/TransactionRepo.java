package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.TransactionEntity;

public interface TransactionRepo extends JpaRepository<TransactionEntity, Long> {

}
