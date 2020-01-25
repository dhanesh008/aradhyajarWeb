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

@Entity
@Table(name="customer_master")
public class CustomerEntity implements Serializable
{

	/**
	 * Dhaneshkumar Solanki
	 * cust_id int(11) AI PK 
	cust_uuid varchar(150) PK 
	area_name varchar(150) 
	area_uuid varchar(45) 
	cust_name varchar(150) 
	cust_mobile1 bigint(10) 
	cust_mobile2 bigint(10) 
	cust_address1 varchar(150) 
	cust_address2 varchar(150) 
	deposite int(11) 
	status varchar(45) 
	cust_tdate date 
	cust_acc_uuid varchar(150)*/
	 
	private static final long serialVersionUID = -7716485780956164707L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cust_id")
	private int custId;
	
	@Column(name="cust_uuid")
	private String custUuid=UUID.randomUUID().toString();
	
	
	@Column(name="area_name")
	private String areaName;
	
	@Column(name="area_uuid")
	private String areaUuid;

	
	@Column(name="cust_name")
	private String custName;
	
	@Column(name="cust_mobile1")
	private Long mobileNo1;
	
	@Column(name="cust_mobile2")
	private Long mobileNo2;
	
	@Column(name="cust_address1")
	private String custAddress1;
	
	@Column(name="cust_address2")
	private String custAddress2;
	
	@Column(name="deposite")
	private int deposite;
	
	@Column(name="status")
	private String status;
	
	@Column(name="cust_tdate")
	private Date custtdate;
	
	@Column(name="cust_acc_uuid")
	private String custAccUuid=UUID.randomUUID().toString();

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustUuid() {
		return custUuid;
	}

	public void setCustUuid(String custUuid) {
		this.custUuid = custUuid;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaUuid() {
		return areaUuid;
	}

	public void setAreaUuid(String areaUuid) {
		this.areaUuid = areaUuid;
	}


	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Long getMobileNo1() {
		return mobileNo1;
	}

	public void setMobileNo1(Long mobileNo1) {
		this.mobileNo1 = mobileNo1;
	}

	public Long getMobileNo2() {
		return mobileNo2;
	}

	public void setMobileNo2(Long mobileNo2) {
		this.mobileNo2 = mobileNo2;
	}

	public String getCustAddress1() {
		return custAddress1;
	}

	public void setCustAddress1(String custAddress1) {
		this.custAddress1 = custAddress1;
	}

	public String getCustAddress2() {
		return custAddress2;
	}

	public void setCustAddress2(String custAddress2) {
		this.custAddress2 = custAddress2;
	}

	public int getDeposite() {
		return deposite;
	}

	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCusttdate() {
		return custtdate;
	}

	public void setCusttdate(Date custtdate) {
		this.custtdate = custtdate;
	}

	public String getCustAccUuid() {
		return custAccUuid;
	}

	public void setCustAccUuid(String custAccUuid) {
		this.custAccUuid = custAccUuid;
	}

	@Override
	public String toString() {
		return "CustomerEntity [custId=" + custId + ", custUuid=" + custUuid + ", areaName=" + areaName + ", areaUuid="
				+ areaUuid  + ", custName=" + custName + ", mobileNo1=" + mobileNo1
				+ ", mobileNo2=" + mobileNo2 + ", custAddress1=" + custAddress1 + ", custAddress2=" + custAddress2
				+ ", deposite=" + deposite + ", status=" + status + ", custtdate=" + custtdate + ", custAccUuid="
				+ custAccUuid + "]";
	}
	
	
	
}
