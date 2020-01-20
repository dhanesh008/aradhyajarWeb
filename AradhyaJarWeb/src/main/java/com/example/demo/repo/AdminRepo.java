package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.AdminEntity;

@Repository
public interface AdminRepo extends JpaRepository<AdminEntity, Long> 
{

	@Query("SELECT a FROM AdminEntity a WHERE a.adminEmail=:userId and a.adminPassword=:userPassword")
	AdminEntity findByEmailandpassword(String userId, String userPassword);
	
	@Query("SELECT COUNT(*) FROM AdminEntity a WHERE a.adminEmail=:userId")
	int findbyEmail(String userId);
	

}
