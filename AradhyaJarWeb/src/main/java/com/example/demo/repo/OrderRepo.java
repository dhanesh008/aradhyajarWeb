package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.OrderMasterEntity;

public interface OrderRepo extends JpaRepository<OrderMasterEntity, Long> {

}
