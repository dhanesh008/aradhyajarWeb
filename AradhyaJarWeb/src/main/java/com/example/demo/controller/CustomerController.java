package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Entity.CustomerEntity;
import com.example.demo.POJO.AreaVO;
import com.example.demo.POJO.CustomerVo;
import com.example.demo.POJO.ResultVo;
import com.example.demo.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/list/getcustList",method = RequestMethod.GET)
    public @ResponseBody List<CustomerEntity> getAllCustomer() 
	{
		return customerService.getAllCustomer();
    }
	

	@RequestMapping(value="/add/newCustomer",method = RequestMethod.POST)
	public @ResponseBody ResultVo addnewarea(
			@RequestParam String areaname,
			@RequestParam String areaUuid,
			@RequestParam String cusname,
			@RequestParam String address1,
			@RequestParam String address2,
			@RequestParam Long mobile1,
			@RequestParam Long mobile2,
			@RequestParam Integer deposite)
	{
		return customerService.addnewCustomer(areaname, areaUuid, cusname, address1, address2, mobile1, mobile2, deposite);
	}
	
	
}
