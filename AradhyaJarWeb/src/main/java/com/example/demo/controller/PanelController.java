package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class PanelController
{
	@RequestMapping(value = "/panel/home")
    public String login(HttpSession session)
	{
		if(session.getAttribute("user")==null)
				{
			 		return "redirect:/login";
				}
		else
		{
			 return "panelHome";
		}
		
       
    }

	@RequestMapping(value = "/panel/area")
    public String area(HttpSession session)
	{
		if(session.getAttribute("user")==null)
				{
			 		return "redirect:/login";
				}
		else
		{
			 return "panelarea";
		}
		
       
    }
	@RequestMapping(value = "/panel/customer")
    public String customer(HttpSession session)
	{
		if(session.getAttribute("user")==null)
				{
			 		return "redirect:/login";
				}
		else
		{
			 return "panelcustomer";
		}
		
       
    }
}
