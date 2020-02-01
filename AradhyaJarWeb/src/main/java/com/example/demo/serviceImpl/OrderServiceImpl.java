package com.example.demo.serviceImpl;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.AreaEntity;
import com.example.demo.Entity.OrderMasterEntity;
import com.example.demo.POJO.ResultVo;
import com.example.demo.repo.OrderRepo;
import com.example.demo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService 
{
	
	@Autowired
	OrderRepo orderrepo;

	@Override
	@Transactional
	public ResultVo addNewOrder(String cusname, String address, Long mob1, Long mob2, String date, String time,
			int depoiste, int jar, int jarrate, int bot, int botrate, String orderDetails) throws ParseException
	{
		ResultVo resultVo=new ResultVo();
		int pending,total;
		total=(jar*jarrate)+(bot*botrate);
		pending=total-depoiste;
		OrderMasterEntity orderMasterEntity=new OrderMasterEntity();
		OrderMasterEntity saveeorderMasterEntity=new OrderMasterEntity();
		orderMasterEntity.setCustomerName(cusname);
		orderMasterEntity.setAddress(address);
		orderMasterEntity.setMobileNo1(mob1);
		orderMasterEntity.setMobileNo2(mob2);
		orderMasterEntity.setJarNo(jar);
		orderMasterEntity.setJarRate(jarrate);
		orderMasterEntity.setBotNo(bot);
		orderMasterEntity.setBotRate(botrate);
		orderMasterEntity.setOrerDetails(orderDetails);
		Date date1= new SimpleDateFormat("dd/MM/yyyy").parse(date);  
	    orderMasterEntity.setOrderDeposite(depoiste);
		orderMasterEntity.setOrderDate(date1);
		orderMasterEntity.setCancel(0);
		orderMasterEntity.setTotal(total);
		orderMasterEntity.setPending(pending);
		saveeorderMasterEntity=orderrepo.save(orderMasterEntity);
		if(saveeorderMasterEntity==null)
			{
			resultVo.setMsg("Failed To save OrderDetails");
			resultVo.setResult(1);
			}
		else
		{
			resultVo.setMsg("order Saved SuccessFully");
			resultVo.setResult(1);
		}
		return resultVo;
	}

	@Override
	public List<OrderMasterEntity> getopenorderlist() {
		List<OrderMasterEntity> orderMasterEntities=new ArrayList<>();
		orderMasterEntities=orderrepo.findopenorders();
		return orderMasterEntities;
	}
	

}
