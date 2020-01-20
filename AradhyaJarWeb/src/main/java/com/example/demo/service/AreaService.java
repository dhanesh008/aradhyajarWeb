package com.example.demo.service;

import java.util.List;

import com.example.demo.POJO.AreaVO;
import com.example.demo.POJO.ResultVo;

public interface AreaService {

	List<AreaVO> getAreaList();

	ResultVo addnewArea(String areaname, int jarRate, int botrate);

}
