package com.example.demo.service;

import javax.servlet.http.HttpSession;

import com.example.demo.POJO.LoginVO;
import com.example.demo.POJO.ResultVo;

public interface AdminService 
{

	String savenewDetails();

	LoginVO CheckuserLogin(String userId, String userPassword);
	

}
