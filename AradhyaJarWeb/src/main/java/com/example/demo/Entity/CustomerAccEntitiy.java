package com.example.demo.Entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cust_acc_master")
public class CustomerAccEntitiy implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3765589141616024632L;

	/*
	 able: cust_acc_master
Columns:
id int(11) PK 
acc_uuid varchar(150) PK 
cus_uuid varchar(150) PK 
pen_jar int(11) 
pen_bottel int(11) 
pen_amount int(11)*/
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="acc_uuid")
	private String accUuid;
	
	@Column(name="cus_uuid")
	private String custUuid;
	
	@Column(name="pen_jar")
	private int penJar;
	
	@Column(name="pen_bottel")
	private int penbottel;
	
	@Column(name="pen_amount")
	private int penAmount;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAccUuid() {
		return accUuid;
	}

	public void setAccUuid(String accUuid) {
		this.accUuid = accUuid;
	}

	public String getCustUuid() {
		return custUuid;
	}

	public void setCustUuid(String custUuid) {
		this.custUuid = custUuid;
	}

	public int getPenJar() {
		return penJar;
	}

	public void setPenJar(int penJar) {
		this.penJar = penJar;
	}

	public int getPenbottel() {
		return penbottel;
	}

	public void setPenbottel(int penbottel) {
		this.penbottel = penbottel;
	}

	public int getPenAmount() {
		return penAmount;
	}

	public void setPenAmount(int penAmount) {
		this.penAmount = penAmount;
	}

	@Override
	public String toString() {
		return "CutsomerAccountEntity [Id=" + Id + ", accUuid=" + accUuid + ", custUuid=" + custUuid + ", penJar="
				+ penJar + ", penbottel=" + penbottel + ", penAmount=" + penAmount + "]";
	}
	
	
	
	
}
