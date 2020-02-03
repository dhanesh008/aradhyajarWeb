package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

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
		
		
		List<CustomerEntity> customerEntities=customerRepo.findbyAreaUuid(areauuid);
		System.out.println(customerEntities);
		
		
		for(int i=0;i<customerEntities.size();i++)
		
		{
			    System.out.println(customerEntities.get(i));
			    TransCustomerVo transCustomerVo=new TransCustomerVo();
			    CustomerAccEntitiy accEntitiy=customerAccRepo.findByaccuuid(customerEntities.get(i).getCustUuid(),customerEntities.get(i).getCustAccUuid());
			    transCustomerVo.setAcc_uuid(customerEntities.get(i).getCustAccUuid());
			    transCustomerVo.setCusuuid(customerEntities.get(i).getCustUuid());
			    transCustomerVo.setCusname(customerEntities.get(i).getCustName());
			    transCustomerVo.setMobile1(customerEntities.get(i).getMobileNo1());
			    transCustomerVo.setMobile2(customerEntities.get(i).getMobileNo2());
			    transCustomerVo.setAddress(customerEntities.get(i).getCustAddress1());
			    transCustomerVo.setJar(accEntitiy.getPenJar());
			    transCustomerVo.setBot(accEntitiy.getPenbottel());
			    transCustomerVo.setAmount(accEntitiy.getPenAmount());
			    transCustomerVos.add(transCustomerVo);
			
			
		}
		
		System.out.println(transCustomerVos);
		return transCustomerVos;
		
		
		
	}

	@Override
	
	public ResultVo newTransaction(String cusuuid, int jarpick, int botpick, int jardel, int botdel, int amount)
	{
		System.out.println("jardel"+jardel);
		 System.out.println("botdel"+botdel);
		ResultVo resultVo=new ResultVo();
		CustomerAccEntitiy accEntitiy=new CustomerAccEntitiy();
		CustomerEntity customerEntity=new CustomerEntity();
		AreaEntity areaEntity=new AreaEntity();
		TransactionEntity transactionEntity=new TransactionEntity();
		 customerEntity=customerRepo.findbyCusUuid(cusuuid);
		 System.out.println(customerEntity);
		 if(customerEntity==null)
		 {
			 resultVo.setMsg("Details Not Found");
				resultVo.setResult(0);
		 }
		 else
		 {
			 areaEntity=areaRepo.getAreabyUuid(customerEntity.getAreaUuid());
			 System.out.println(areaEntity);
			 System.out.println(jardel);
			 System.out.println(botdel);
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
			 
			  int total=0,pending = 0,advcance = 0;
			  total=((jardel*areaEntity.getAreaJarRate())+(botdel*areaEntity.getAreaBotRate()));
			  System.out.println(total);
			  transactionEntity.setTransactionTotal(total);
			  
			  if(total>=amount)
			  {
				  pending=total-amount;
			  }else {
				  advcance=amount-total;
			  }
			  System.out.println(total);
			  System.out.println(pending);
			  System.out.println(advcance);
			  transactionEntity.setTransactionPending(pending);
			  transactionEntity.setTransactionAdvance(advcance);
			  accEntitiy=customerAccRepo.findByaccuuid(customerEntity.getCustUuid(),customerEntity.getCustAccUuid());
				if(accEntitiy==null)
				{
					resultVo.setMsg("Account Details Not Found");
					resultVo.setResult(0);
				}
				else
				{
					accEntitiy.setPenJar((accEntitiy.getPenJar()+jardel)-jarpick);
					accEntitiy.setPenbottel((accEntitiy.getPenbottel()+botdel)-botpick);
					accEntitiy.setPenAmount((accEntitiy.getPenAmount()+pending)-advcance);
					if(customerAccRepo.save(accEntitiy)!=null && transactionRepo.save(transactionEntity)!=null)
					{
						resultVo.setMsg("Account updated SuccessFully");
						resultVo.setResult(1);
					}
					else
					{
						resultVo.setMsg("Failed to save Details");
						resultVo.setResult(0);
					}
				}
		 }
		return resultVo;
	}

	@Override
	public List<TransactionEntity> getdayTransactionList() {
		
		return transactionRepo.getdayTransaction();
	}
	

}
