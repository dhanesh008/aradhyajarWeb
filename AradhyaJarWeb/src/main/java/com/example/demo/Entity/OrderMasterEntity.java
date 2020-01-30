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
@Table(name="order_master")
public class OrderMasterEntity implements Serializable {
	/**
	 * DhaneshJain
	 */
	private static final long serialVersionUID = -7160838752514458637L;

	/*
	 * Table: order_master
Columns:
id int(11) AI PK 
order_uuid varchar(45) PK 
customer_name varchar(255) 
address varchar(255) 
mobile1 bigint(10) 
mobile2 bigint(10) 
order_date_time datetime 
deposite int(11) 
jar_no int(11) 
bot_no int(11) 
jar_rate int(11) 
bot_rate int(11) 
total int(11) 
pending int(11) 
order_deposite int(11) 
tdate date 
cancel smallint(1) 
orer_details varchar(255)*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="order_uuid")
	private String orderUuid=UUID.randomUUID().toString();

	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="mobile1")
	private Long mobileNo1;
	
	@Column(name="mobile2")
	private Long mobileNo2;
	
	@Column(name="order_date_time")
	private Date orderDate;
	
	@Column(name="deposite")
	private int deposite;
	
	@Column(name="jar_no")
	private int jarNo;
	
	@Column(name="bot_no")
	private int botNo;
	
	
	@Column(name="jar_rate")
	private int jarRate;
	
	@Column(name="bot_rate")
	private int botRate;
	
	@Column(name="total")
	private int total;
	
	@Column(name="pending")
	private int pending;
	
	@Column(name="order_deposite")
	private int orderDeposite;
	
	@Column(name="tdate")
	private Date tdate;
	
	@Column(name="cancel")
	private int cancel;
	
	@Column(name="orer_details")
	private String orerDetails;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getOrderUuid() {
		return orderUuid;
	}

	public void setOrderUuid(String orderUuid) {
		this.orderUuid = orderUuid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getDeposite() {
		return deposite;
	}

	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}

	public int getJarNo() {
		return jarNo;
	}

	public void setJarNo(int jarNo) {
		this.jarNo = jarNo;
	}

	public int getBotNo() {
		return botNo;
	}

	public void setBotNo(int botNo) {
		this.botNo = botNo;
	}

	public int getJarRate() {
		return jarRate;
	}

	public void setJarRate(int jarRate) {
		this.jarRate = jarRate;
	}

	public int getBotRate() {
		return botRate;
	}

	public void setBotRate(int botRate) {
		this.botRate = botRate;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPending() {
		return pending;
	}

	public void setPending(int pending) {
		this.pending = pending;
	}

	public int getOrderDeposite() {
		return orderDeposite;
	}

	public void setOrderDeposite(int orderDeposite) {
		this.orderDeposite = orderDeposite;
	}

	public Date getTdate() {
		return tdate;
	}

	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}

	public int getCancel() {
		return cancel;
	}

	public void setCancel(int cancel) {
		this.cancel = cancel;
	}

	public String getOrerDetails() {
		return orerDetails;
	}

	public void setOrerDetails(String orerDetails) {
		this.orerDetails = orerDetails;
	}

	@Override
	public String toString() {
		return "OrderMasterEntity [Id=" + Id + ", orderUuid=" + orderUuid + ", customerName=" + customerName
				+ ", address=" + address + ", mobileNo1=" + mobileNo1 + ", mobileNo2=" + mobileNo2 + ", orderDate="
				+ orderDate + ", deposite=" + deposite + ", jarNo=" + jarNo + ", botNo=" + botNo + ", jarRate="
				+ jarRate + ", botRate=" + botRate + ", total=" + total + ", pending=" + pending + ", orderDeposite="
				+ orderDeposite + ", tdate=" + tdate + ", cancel=" + cancel + ", orerDetails=" + orerDetails + "]";
	}
	
	
	
	
}
