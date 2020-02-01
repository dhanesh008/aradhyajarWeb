package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.OrderMasterEntity;

public interface OrderRepo extends JpaRepository<OrderMasterEntity, Long> {

	@Query("SELECT u from OrderMasterEntity u WHERE u.cancel=0 ORDER BY u.tdate ASC")
	List<OrderMasterEntity> findopenorders();

}
