package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.CustomerAccEntitiy;
import com.example.demo.Entity.CustomerEntity;

public interface CustomerAccRepo extends JpaRepository<CustomerAccEntitiy, Long> {

}
