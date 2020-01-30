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
@Table(name="order_log")
public class OrderLogEntity implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3138588177609848477L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="orderlog_uuid")
	private String orderLogUuid=UUID.randomUUID().toString();

	@Column(name="order_uuid")
	private String orderUuid;
	
	@Column(name="jar_pickup")
	private int jarPickup;
	
	@Column(name="bot_pickup")
	private int botPickup;
	
	@Column(name="jar_delivered")
	private int jarDelivered;
	
	
	@Column(name="botDelivered")
	private int botDelivered;
	
	@Column(name="payment")
	private int payment;
	
	@Column(name="tdate")
	private Date tdate;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getOrderLogUuid() {
		return orderLogUuid;
	}

	public void setOrderLogUuid(String orderLogUuid) {
		this.orderLogUuid = orderLogUuid;
	}

	public String getOrderUuid() {
		return orderUuid;
	}

	public void setOrderUuid(String orderUuid) {
		this.orderUuid = orderUuid;
	}

	public int getJarPickup() {
		return jarPickup;
	}

	public void setJarPickup(int jarPickup) {
		this.jarPickup = jarPickup;
	}

	public int getBotPickup() {
		return botPickup;
	}

	public void setBotPickup(int botPickup) {
		this.botPickup = botPickup;
	}

	public int getJarDelivered() {
		return jarDelivered;
	}

	public void setJarDelivered(int jarDelivered) {
		this.jarDelivered = jarDelivered;
	}

	public int getBotDelivered() {
		return botDelivered;
	}

	public void setBotDelivered(int botDelivered) {
		this.botDelivered = botDelivered;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public Date getTdate() {
		return tdate;
	}

	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}

	@Override
	public String toString() {
		return "OrderLogEntity [Id=" + Id + ", orderLogUuid=" + orderLogUuid + ", orderUuid=" + orderUuid
				+ ", jarPickup=" + jarPickup + ", botPickup=" + botPickup + ", jarDelivered=" + jarDelivered
				+ ", botDelivered=" + botDelivered + ", payment=" + payment + ", tdate=" + tdate + "]";
	}

	
	
}
