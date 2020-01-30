package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.OrderLogEntity;

public interface OrderLogRepo extends JpaRepository<OrderLogEntity, Long> {

}
