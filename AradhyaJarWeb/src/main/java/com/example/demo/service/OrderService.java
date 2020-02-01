package com.example.demo.service;

import java.text.ParseException;
import java.util.List;

import com.example.demo.Entity.OrderLogEntity;
import com.example.demo.Entity.OrderMasterEntity;
import com.example.demo.POJO.ResultVo;

public interface OrderService {

	public ResultVo addNewOrder(String cusname, String address, Long mob1, Long mob2, String date, String time, int depoiste,
			int jar, int jarrate, int bot, int botrate, String orderDetails) throws ParseException;

	public List<OrderMasterEntity> getopenorderlist();

	public ResultVo addnewtransaction(String orderuuid, int jarpick, int botpick, int jardel, int botdel, int payment);

	public List<OrderLogEntity> getorderloginfo(String uuid);
	

}
