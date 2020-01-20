package com.example.demo.controller;

import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.POJO.AreaVO;
import com.example.demo.POJO.ResultVo;
import com.example.demo.service.AreaService;

@Controller
public class AreaController {
	
	@Autowired
	AreaService areaService;
	
	

	@RequestMapping(value = "/list/getareaList",method = RequestMethod.GET)
    public @ResponseBody List<AreaVO> getAllAreaList() 
	{
		return areaService.getAreaList();
    }
	
	@RequestMapping(value="/add/newarea",method = RequestMethod.POST)
	public @ResponseBody ResultVo addnewarea(@RequestParam String areaname,@RequestParam int jarRate,@RequestParam int botrate)
	{
		return areaService.addnewArea(areaname,jarRate,botrate);
	}
}
