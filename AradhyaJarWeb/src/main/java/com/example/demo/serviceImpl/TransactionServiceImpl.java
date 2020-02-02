package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.AreaEntity;
import com.example.demo.Entity.CustomerAccEntitiy;
import com.example.demo.Entity.CustomerEntity;
import com.example.demo.Entity.TransactionEntity;
import com.example.demo.POJO.ResultVo;
import com.example.demo.POJO.TransCustomerVo;
import com.example.demo.repo.AraeRepo;
import com.example.demo.repo.CustomerAccRepo;
import com.example.demo.repo.CustomerRepo;
import com.example.demo.repo.TransactionRepo;
import com.example.demo.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService 
{

	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	CustomerAccRepo customerAccRepo;
	
	@Autowired
	AraeRepo areaRepo;
	
	@Autowired
	TransactionRepo transactionRepo;
	
	@Override
	public List<TransCustomerVo> getcustomerlist(String areauuid) 
	{
		List<TransCustomerVo> transCustomerVos=new ArrayList<>();
		TransCustomerVo transCustomerVo=new TransCustomerVo();
		
		List<CustomerEntity> customerEntities=customerRepo.findbyAreaUuid(areauuid);
		System.out.println(customerEntities);
		if(customerEntities.size()==0)
			{
				
			}
		else
		{
			for (CustomerEntity var : customerEntities) 
			{ 
			    System.out.println(var);
			    CustomerAccEntitiy accEntitiy=customerAccRepo.findByaccuuid(var.getCustUuid(),var.getCustAccUuid());
			    transCustomerVo.setAcc_uuid(var.getCustAccUuid());
			    transCustomerVo.setCusuuid(var.getCustUuid());
			    transCustomerVo.setCusname(var.getCustName());
			    transCustomerVo.setMobile1(var.getMobileNo1());
			    transCustomerVo.setMobile2(var.getMobileNo2());
			    transCustomerVo.setAddress(var.getCustAddress1());
			    transCustomerVo.setJar(accEntitiy.getPenJar());
			    transCustomerVo.setBot(accEntitiy.getPenbottel());
			    transCustomerVo.setAmount(accEntitiy.getPenAmount());
			    transCustomerVos.add(transCustomerVo);
			}
			
		}
		return transCustomerVos;
		
		
		
	}

	@Override
	public ResultVo newTransaction(String cusuuid, int jarpick, int botpick, int jardel, int botdel, int amount,int pen)
	{
		ResultVo resultVo=new ResultVo();
		CustomerAccEntitiy accEntitiy=new CustomerAccEntitiy();
		CustomerEntity customerEntity=new CustomerEntity();
		AreaEntity areaEntity=new AreaEntity();
		TransactionEntity transactionEntity=new TransactionEntity();
		 customerEntity=customerRepo.findbyCusUuid(cusuuid);
		 if(customerEntity==null)
		 {
			 resultVo.setMsg("Details Not Found");
				resultVo.setResult(0);
		 }
		 else
		 {
			 areaEntity=areaRepo.getAreabyUuid(customerEntity.getAreaUuid());
			 transactionEntity.setTransactionCusUuid(customerEntity.getCustUuid());
			 transactionEntity.setTransactionCustName(customerEntity.getCustName());
			 transactionEntity.setTransactionAreaName(areaEntity.getAreaName());
			 transactionEntity.setTransactionAreaUuid(areaEntity.getAreaUuid());
			 transactionEntity.setTransactionjarPick(jarpick);
			 transactionEntity.setTransactionBotPick(botpick);
			 transactionEntity.setTransactionjarDel(jardel);
			 transactionEntity.setTransactionBotDel(botdel);
			 transactionEntity.setTransactionAmount(amount);
			 transactionEntity.setTransactionJarRate(areaEntity.getAreaJarRate());
			 transactionEntity.setTransactionBotRate(areaEntity.getAreaBotRate());
			  int total=((jardel*areaEntity.getAreaJarRate())+(botdel*areaEntity.getAreaBotRate());
			  transactionEntity.setTransactionTotal(total);
			  if(total>=amount)  //50-40
			  	{
				  int pending=total-amount;
			  	}
			  else
			  {
				  int advance=amount-total;
			  }
			  
			
			 
			 
			 
			 accEntitiy=customerAccRepo.findByuuid(cusuuid);
			 
		 }
		
		
		accEntitiy=customerAccRepo.findByuuid(cusuuid);
		
		
		
		
		if(accEntitiy==null)
		{
			resultVo.setMsg("Details Not Found");
			resultVo.setResult(0);
		}
		else
		{
			accEntitiy.setPenAmount(accEntitiy.getPenJar()+jardel-jarpick);
			accEntitiy.setPenbottel(accEntitiy.getPenbottel()+botdel-botpick);
			accEntitiy.setPenAmount(accEntitiy.getPenAmount()+pen-amount);
			if(customerAccRepo.save(accEntitiy)==null)
			{
				resultVo.setMsg("Failed to save Details");
				resultVo.setResult(0);
			}
			else
			{
				resultVo.setMsg("Account updated SuccessFully");
				resultVo.setResult(1);
			}
		}
		
		
		return resultVo;
	}
	

}
