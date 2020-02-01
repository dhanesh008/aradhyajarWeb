package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.OrderLogEntity;

public interface OrderLogRepo extends JpaRepository<OrderLogEntity, Long> {

	@Query("SELECT u FROM OrderLogEntity u WHERE u.orderUuid=:uuid")
	List<OrderLogEntity> getallOrderLog(String uuid);

}
