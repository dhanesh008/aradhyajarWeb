package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.AreaEntity;
import com.example.demo.POJO.AreaVO;
import com.example.demo.POJO.ResultVo;
import com.example.demo.repo.AraeRepo;
import com.example.demo.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService 
{


	@Autowired
	Mapper mapper;
	
	@Autowired
	AraeRepo areRepo;
	
	@Override
	public List<AreaVO> getAreaList() {
		List<AreaEntity> areaEntities=new ArrayList<>();
		List<AreaVO> areaVO=new ArrayList<>();
		areaEntities=areRepo.getAreaListbyorder();
		mapper.map(areaEntities, areaVO);
		return areaVO;
	}

	@Override
	public ResultVo addnewArea(String areaname, int jarRate, int botrate) {
		AreaEntity areaEntity=new AreaEntity();
		ResultVo resultVo=new ResultVo();
		areaEntity=areRepo.findbyName(areaname.toUpperCase());
		if(areaEntity==null)
			{
				AreaEntity addnewAreaEntity=new AreaEntity();
				addnewAreaEntity.setAreaName(areaname);
				addnewAreaEntity.setAreaStatus("ACTIVE");
				addnewAreaEntity.setAreaJarRate(jarRate);
				addnewAreaEntity.setAreaBotRate(botrate);
				areRepo.save(addnewAreaEntity);
				
					resultVo.setMsg("Area Added SuccessFully");
					resultVo.setResult(0);
				
			}
		else
		{
			resultVo.setMsg("Area Name Already Exists");
			resultVo.setResult(1);
		}
		return resultVo;
	}
	

}
