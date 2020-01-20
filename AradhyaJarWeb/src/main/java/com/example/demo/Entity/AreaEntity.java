package com.example.demo.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name="area_masetr")
public class AreaEntity implements Serializable
{

	/**
	area_masetr * 
Columns:
area_id int(11) AI PK 
area_uuid varchar(45) PK 
area_name varchar(45) 
area_jar_rate int(11) 
area_bot_rate int(11) 
area_status varchar(45) 
area_tdate date
	 */
	private static final long serialVersionUID = 7264132681092978506L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="area_id")
	private int areaId;

	@Column(name="area_uuid")
	private String areaUuid=UUID.randomUUID().toString();
	
	@Column(name="area_name")
	private String areaName;
	
	@Column(name="area_jar_rate")
	private int areaJarRate;
	
	@Column(name="area_bot_rate")
	private int areaBotRate;
	
	@Column(name="area_status")
	private String areaStatus;
	
	@Column(name="area_tdate")
	private Date areaTdate;

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

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
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

	public Date getAreaTdate() {
		return areaTdate;
	}

	public void setAreaTdate(Date areaTdate) {
		this.areaTdate = areaTdate;
	}

	@Override
	public String toString() {
		return "AreaEntity [areaId=" + areaId + ", areaUuid=" + areaUuid + ", areaName=" + areaName + ", areaJarRate="
				+ areaJarRate + ", areaBotRate=" + areaBotRate + ", areaStatus=" + areaStatus + ", areaTdate="
				+ areaTdate + "]";
	}
	
	
}
