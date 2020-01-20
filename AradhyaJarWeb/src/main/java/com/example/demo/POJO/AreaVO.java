package com.example.demo.POJO;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AreaVO {
	
	
	private int areaId;

	private String areaUuid;
	
	private int areaName;
	
	private int areaJarRate;
	
	private int areaBotRate;
	
	private String areaStatus;
	
	private int areaTdate;
	
	private ResultVo resultVo;

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public String getAreaUuid() {
		return areaUuid;
	}

	public void setAreaUuid(String areaUuid) {
		this.areaUuid = areaUuid;
	}

	public int getAreaName() {
		return areaName;
	}

	public void setAreaName(int areaName) {
		this.areaName = areaName;
	}

	public int getAreaJarRate() {
		return areaJarRate;
	}

	public void setAreaJarRate(int areaJarRate) {
		this.areaJarRate = areaJarRate;
	}

	public int getAreaBotRate() {
		return areaBotRate;
	}

	public void setAreaBotRate(int areaBotRate) {
		this.areaBotRate = areaBotRate;
	}

	public String getAreaStatus() {
		return areaStatus;
	}

	public void setAreaStatus(String areaStatus) {
		this.areaStatus = areaStatus;
	}

	public int getAreaTdate() {
		return areaTdate;
	}

	public void setAreaTdate(int areaTdate) {
		this.areaTdate = areaTdate;
	}

	@Override
	public String toString() {
		return "AreaVO [areaId=" + areaId + ", areaUuid=" + areaUuid + ", areaName=" + areaName + ", areaJarRate="
				+ areaJarRate + ", areaBotRate=" + areaBotRate + ", areaStatus=" + areaStatus + ", areaTdate="
				+ areaTdate + "]";
	}

	

}
