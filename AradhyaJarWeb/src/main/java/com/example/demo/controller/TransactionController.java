package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.POJO.ResultVo;
import com.example.demo.POJO.TransCustomerVo;
import com.example.demo.service.TransactionService;



@Controller
public class TransactionController {

	@Autowired
	TransactionService transactionService;
	
	@GetMapping(value="list/custlist")
	public @ResponseBody List<TransCustomerVo> getcustoerList(@RequestParam String areauuid)
	{
		return transactionService.getcustomerlist(areauuid);
	}
	
	@GetMapping(value="cus/newTrans")
	public @ResponseBody ResultVo updatransaction(@RequestParam String uuid,
			@RequestParam int jarpick,@RequestParam int botpick,@RequestParam int jardel,@RequestParam int botdel,@RequestParam int amount)
	{
		return null;
				//transactionService.newTransaction(accuuid,jarpick,botpick,jardel,botdel,amount);
	}
	
	
}
