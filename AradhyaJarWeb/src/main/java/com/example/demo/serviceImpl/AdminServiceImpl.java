package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.AdminEntity;
import com.example.demo.POJO.LoginVO;
import com.example.demo.POJO.ResultVo;
import com.example.demo.POJO.UserLoggVo;
import com.example.demo.repo.AdminRepo;
import com.example.demo.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService 
{
	@Autowired
	AdminRepo adminrepo;

	@Override
	public String savenewDetails() {
		AdminEntity adminEntity=new AdminEntity();
		adminEntity.setAdminEmail("solannaesh2@gmail.com");
		adminEntity.setAdminName("Dhaneshkumar Solanki");
		adminEntity.setAdminmobno("7770088860");
		adminEntity.setAdminOTP(1234);
		adminEntity.setAdminPassword("123456789");
		adminEntity.setAdminStatus("A");
		adminrepo.save(adminEntity);
		return "success";
	}

	@Override
	public LoginVO CheckuserLogin(String userId, String userPassword) {
	
		LoginVO loginVO=new LoginVO();
		UserLoggVo user=new UserLoggVo();
		ResultVo resultVo=new ResultVo();
		if(userId.equals(null) || userId.equals("") || userPassword.equals("") || userPassword.equals(null))
		{
			resultVo.setMsg("Empty Details Found");
			resultVo.setResult(0);
		}
		else
		{
			
			int result=adminrepo.findbyEmail(userId);
			if(result==1)
			{
				AdminEntity adminEntity=new AdminEntity();
				adminEntity=adminrepo.findByEmailandpassword(userId, userPassword);
				if(adminEntity==null)
				{
					resultVo.setMsg("Password Incorrect");
					resultVo.setResult(0);
				}
				else
				{
					if(adminEntity.getAdminStatus().equals("A"))
					{
						user=new UserLoggVo(adminEntity.getAdminEmail(),adminEntity.getAdminUuid(),adminEntity.getAdminName(),adminEntity.getAdminmobno(),adminEntity.getAdminOTP());
						resultVo.setMsg("SuccessFull");
						resultVo.setResult(1);
					}
					else
					{
						resultVo.setMsg("User is Inactive");
						resultVo.setResult(0);	
						
					}
					
				}
			}
			else
			{
				resultVo.setMsg("User Details Not Found");
				resultVo.setResult(0);	
			}
			
		}
		loginVO.setResultVo(resultVo);
		loginVO.setUserLoggVo(user);
		
		return loginVO;
	}

}
