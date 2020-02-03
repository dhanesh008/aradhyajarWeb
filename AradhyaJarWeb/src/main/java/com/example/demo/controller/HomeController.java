package com.example.demo.controller;

import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.AdminEntity;
import com.example.demo.POJO.LoginVO;
import com.example.demo.POJO.ResultVo;
import com.example.demo.POJO.UserLoggVo;
import com.example.demo.service.AdminService;

@Controller
public class HomeController {
	
	@Autowired
	AdminService adminService;

	@RequestMapping(value = { "/", "/index" })
    public String index() {
 
        return "index";
    }
	@RequestMapping(value = "/login")
    public String login(HttpSession session) {
		  session.invalidate();
        return "login";
    }
	
	@RequestMapping(value = "/savenewuser",method = RequestMethod.GET)
    public String savenewuser() 
	{
		String result=adminService.savenewDetails();
 
        return result;
    }
	
	@RequestMapping(value = "/loginProcess",method = RequestMethod.POST)
    public @ResponseBody ResultVo loginProcess(@RequestParam("userid") String userId,@RequestParam("userpassword") String userPassword,HttpSession session) 
	{
		LoginVO loginVO=new LoginVO();
		
		loginVO=adminService.CheckuserLogin(userId,userPassword);
		if(loginVO.getResultVo().getResult()==1)
		{
			session.setAttribute("user", loginVO.getUserLoggVo());
			
		}
		return loginVO.getResultVo();
       
    }
	
    @RequestMapping(value="/logout",method=RequestMethod.GET)
    public String logout(HttpSession session) {
      session.invalidate();
      return "redirect:/index";
    }
	
	
	
	
	
	
	
}
