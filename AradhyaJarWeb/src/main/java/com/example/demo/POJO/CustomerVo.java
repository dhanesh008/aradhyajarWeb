package com.example.demo.POJO;

import java.util.Date;

public class CustomerVo {
	
	private int custId;
	
	private String custUuid;
	
	private String areaName;
	
	private String areaUuid;
	
	private String custName;
	
	private Long mobileNo1;
	
	private Long mobileNo2;
	
	private String custAddress1;
	
	private String custAddress2;
	
	private int deposite;
	
	private String status;
	
	private Date custtdate;
	
	private String custAccUuid;

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
		return "CustomerVo [custId=" + custId + ", custUuid=" + custUuid + ", areaName=" + areaName + ", areaUuid="
				+ areaUuid + ", custName=" + custName + ", mobileNo1=" + mobileNo1 + ", mobileNo2=" + mobileNo2
				+ ", custAddress1=" + custAddress1 + ", custAddress2=" + custAddress2 + ", deposite=" + deposite
				+ ", status=" + status + ", custtdate=" + custtdate + ", custAccUuid=" + custAccUuid + "]";
	}
	
	
}
