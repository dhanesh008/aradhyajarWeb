package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.TransactionEntity;

public interface TransactionRepo extends JpaRepository<TransactionEntity, Long> {

	@Query("SELECT U FROM TransactionEntity U WHERE U.transactionTdate=current_date")
	List<TransactionEntity> getdayTransaction();

}
