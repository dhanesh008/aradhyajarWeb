package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.CustomerEntity;
import com.example.demo.POJO.CustomerVo;
import com.example.demo.POJO.ResultVo;


public interface CustomerService 
{

	ResultVo addnewCustomer(String area_name, String areuuid, String cust_name, String address1, String address2,
			Long mobileNo1, Long mobileNo2, Integer  deposite);

	List<CustomerEntity> getAllCustomer();
	

}
