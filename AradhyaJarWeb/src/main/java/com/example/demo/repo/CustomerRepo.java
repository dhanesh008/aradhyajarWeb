package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Long> {

	@Query("SELECT COUNT(u) FROM CustomerEntity u WHERE u.mobileNo1=:mobileNo1 or u.mobileNo2=:mobileNo2 or u.mobileNo1=:mobileNo2 or u.mobileNo2=:mobileNo1 ")
	int findbyMobileNo(Long mobileNo1, Long mobileNo2);

	@Query("SELECT U FROM CustomerEntity U ORDER BY U.custtdate DESC")
	List<CustomerEntity> getCustomerList();

	@Query("SELECT U FROM CustomerEntity U WHERE U.areaUuid=:areauuid ORDER BY U.custtdate DESC")
	List<CustomerEntity> findbyAreaUuid(String areauuid);

	@Query("SELECT U FROM CustomerEntity U WHERE U.custUuid=:cusuuid")
	CustomerEntity findbyCusUuid(String cusuuid);



	
}
