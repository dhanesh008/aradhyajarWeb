package com.example.demo.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Entity.OrderMasterEntity;
import com.example.demo.POJO.AreaVO;
import com.example.demo.POJO.ResultVo;
import com.example.demo.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderservice;
	
	@RequestMapping(value = "/order/getopenorderList",method = RequestMethod.GET)
    public @ResponseBody List<OrderMasterEntity> getAllAreaList() 
	{
		return orderservice.getopenorderlist();
    }
	
	
	@RequestMapping(value="order/savenewOrder",method = RequestMethod.GET)
	public @ResponseBody ResultVo addneOrder(
			@RequestParam String cusname,
			@RequestParam String address,
			@RequestParam Long mobile1,
			@RequestParam Long mobile2,
			@RequestParam String date,
			@RequestParam String time,
			@RequestParam int depoiste,
			@RequestParam int jar,
			@RequestParam int jarrate,
			@RequestParam int bot,
			@RequestParam int botrate,
			@RequestParam String orderDetails) throws ParseException 
	{
		return orderservice.addNewOrder(cusname,address,mobile1,mobile2,date,time,depoiste,jar,jarrate,bot,botrate,orderDetails);
	}  
	
}
