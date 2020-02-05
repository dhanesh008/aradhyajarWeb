package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.CustomerEntity;
import com.example.demo.Entity.AreaEntity;
import com.example.demo.Entity.CustomerAccEntitiy;
import com.example.demo.POJO.AreaVO;
import com.example.demo.POJO.CustomerVo;
import com.example.demo.POJO.ResultVo;
import com.example.demo.repo.CustomerAccRepo;
import com.example.demo.repo.CustomerRepo;
import com.example.demo.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	Mapper mapper;
	
	@Autowired
	CustomerAccRepo customerAccRepo;

	@Transactional
	@Override
	public ResultVo addnewCustomer(String area_name, String areuuid, String cust_name, String address1, String address2,
			Long mobileNo1, Long mobileNo2, Integer deposite) 
	{
		ResultVo resultVo=new ResultVo();

		if (area_name.equals(null) || area_name.equals("") || areuuid.equals(null) || areuuid.equals("")
				|| cust_name.equals(null) || cust_name.equals("") || address1.equals(null) || address1.equals("")
				|| mobileNo1.equals(null) || mobileNo1.equals("") || mobileNo2.equals(null) || mobileNo2.equals("")
				|| deposite == null) 
		{
					resultVo.setMsg("Empty Fields");
					resultVo.setResult(0);
		}
		else
		{
			if(customerRepo.findbyMobileNo(mobileNo1,mobileNo2)>0)
			{
				resultVo.setMsg("Mobile No Already Exists");
				resultVo.setResult(0);
			}
			else
			{
				//save Customer Details
				CustomerEntity customerEntity=new CustomerEntity();
				customerEntity.setAreaName(area_name);
				customerEntity.setAreaUuid(areuuid);
				customerEntity.setCustName(cust_name);
				customerEntity.setCustAddress1(address1);
				customerEntity.setCustAddress2(address2);
				customerEntity.setMobileNo1(mobileNo1);
				customerEntity.setMobileNo2(mobileNo2);
				customerEntity.setDeposite(deposite);
				customerEntity.setStatus("A");
				CustomerEntity addnewCustomer=customerRepo.save(customerEntity);
				//add new Cutomer Acc Details
				CustomerAccEntitiy cusAccountEntity=new CustomerAccEntitiy(); 
				cusAccountEntity.setAccUuid(addnewCustomer.getCustAccUuid());
				cusAccountEntity.setCustUuid(addnewCustomer.getCustUuid());
				cusAccountEntity.setPenAmount(0);
				cusAccountEntity.setPenbottel(0);
				cusAccountEntity.setPenJar(0);
				customerAccRepo.save(cusAccountEntity);
				resultVo.setMsg("Customer Added SuccessFully");
				resultVo.setResult(0);
			}
		
		}

		return resultVo;
	}

	@Override
	public List<CustomerEntity> getAllCustomer() {
		List<CustomerEntity> customerEntities=new ArrayList<>();
		List<CustomerVo> customerVos=new ArrayList<>();
		customerEntities=customerRepo.getCustomerList();
		System.err.println(customerEntities);
		mapper.map(customerEntities, customerVos);
		System.out.println("sdfsdfsfsdf"+customerVos);
		
		
		return customerEntities;
	}

	@Override
	public ResultVo updateCustomerDetails(String cusuuid, String cusname, String cusadd, Long cusmob1, Long cusmob2) {
		// TODO Auto-generated method stub
		return null;
	}

}
