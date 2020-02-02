package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.CustomerAccEntitiy;
import com.example.demo.Entity.CustomerEntity;


public interface CustomerAccRepo extends JpaRepository<CustomerAccEntitiy, Long> {

	@Query("SELECT u from CustomerAccEntitiy u WHERE u.custUuid=:custAccUuid and u.accUuid=:accuuid")
	CustomerAccEntitiy findByaccuuid(String custAccUuid,String accuuid);

	@Query("SELECT u from CustomerAccEntitiy u WHERE u.accUuid=:accuuid")
	CustomerAccEntitiy findByuuid(String accuuid);

}
