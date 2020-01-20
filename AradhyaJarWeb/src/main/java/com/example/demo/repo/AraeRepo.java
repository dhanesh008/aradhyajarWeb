package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.AdminEntity;
import com.example.demo.Entity.AreaEntity;

public interface AraeRepo extends JpaRepository<AreaEntity, Long> 
{

	@Query("SELECT U FROM AreaEntity U WHERE UPPER(U.areaName)=:areaname")
	AreaEntity findbyName(String areaname);

	@Query("SELECT U FROM AreaEntity U ORDER BY U.areaName,U.areaTdate DESC")
	List<AreaEntity> getAreaListbyorder();

}
