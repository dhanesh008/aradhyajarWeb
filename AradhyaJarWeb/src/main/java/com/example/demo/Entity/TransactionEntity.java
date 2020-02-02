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
@Table(name="transaction_mastr")
public class TransactionEntity implements Serializable 
{

	/**
	 * Table: transaction_mastr
Columns:
idtransaction_id int(11) AI PK 
transaction_uuid varchar(255) PK 
transaction_cusUuid varchar(255) 
transaction_cust_name varchar(45) 
transaction_area_name varchar(45) 
transaction_area_uuid varchar(45) 
transaction_jarpickup int(11) 
transaction_botpickup int(11) 
transaction_jardel int(11) 
transaction_botdel int(11) 
transaction_jarrate int(11) 
transaction_botrate int(11) 
transaction_total int(11) 
transaction_amount int(11) 
transaction_pending int(11) 
transaction_advance int(11) 
transaction_tdate date 
cancel int(11)
	 */
	private static final long serialVersionUID = 2878760357068815733L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idtransaction_id")
	private int Id;
	
	@Column(name="transaction_uuid")
	private String transactionUuid=UUID.randomUUID().toString();
	
	@Column(name="transaction_cusUuid")
	private String transactionCusUuid;
	
	@Column(name="transaction_cust_name")
	private String transactionCustName;
	
	@Column(name="transaction_area_name")
	private String transactionAreaName;
	
	@Column(name="transaction_area_uuid")
	private String transactionAreaUuid;
	
	@Column(name="transaction_jarpickup")
	private int transactionjarPick;
	
	@Column(name="transaction_botpickup")
	private int transactionBotPick;
	
	@Column(name="transaction_jardel")
	private int transactionjarDel;
	
	@Column(name="transaction_botdel")
	private int transactionBotDel;
	
	@Column(name="transaction_jarrate")
	private int transactionJarRate;
	
	@Column(name="transaction_botrate")
	private int transactionBotRate;
	
	@Column(name="transaction_amount")
	private int transactionAmount;
	
	@Column(name="transaction_total")
	private int transactionTotal;
	
	@Column(name="transaction_pending")
	private int transactionPending;
	
	@Column(name="transaction_advance")
	private int transactionAdvance;
	
	@Column(name="transaction_tdate")
	private Date transactionTdate;
	
	@Column(name="cancel")
	private int transactionCancel;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTransactionUuid() {
		return transactionUuid;
	}

	public void setTransactionUuid(String transactionUuid) {
		this.transactionUuid = transactionUuid;
	}

	public String getTransactionCusUuid() {
		return transactionCusUuid;
	}

	public void setTransactionCusUuid(String transactionCusUuid) {
		this.transactionCusUuid = transactionCusUuid;
	}

	public String getTransactionCustName() {
		return transactionCustName;
	}

	public void setTransactionCustName(String transactionCustName) {
		this.transactionCustName = transactionCustName;
	}

	public String getTransactionAreaName() {
		return transactionAreaName;
	}

	public void setTransactionAreaName(String transactionAreaName) {
		this.transactionAreaName = transactionAreaName;
	}

	public String getTransactionAreaUuid() {
		return transactionAreaUuid;
	}

	public void setTransactionAreaUuid(String transactionAreaUuid) {
		this.transactionAreaUuid = transactionAreaUuid;
	}

	public int getTransactionjarPick() {
		return transactionjarPick;
	}

	public void setTransactionjarPick(int transactionjarPick) {
		this.transactionjarPick = transactionjarPick;
	}

	public int getTransactionBotPick() {
		return transactionBotPick;
	}

	public void setTransactionBotPick(int transactionBotPick) {
		this.transactionBotPick = transactionBotPick;
	}

	public int getTransactionJarRate() {
		return transactionJarRate;
	}

	public void setTransactionJarRate(int transactionJarRate) {
		this.transactionJarRate = transactionJarRate;
	}

	public int getTransactionBotRate() {
		return transactionBotRate;
	}

	public void setTransactionBotRate(int transactionBotRate) {
		this.transactionBotRate = transactionBotRate;
	}

	public int getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public int getTransactionPending() {
		return transactionPending;
	}

	public void setTransactionPending(int transactionPending) {
		this.transactionPending = transactionPending;
	}

	public int getTransactionAdvance() {
		return transactionAdvance;
	}

	public void setTransactionAdvance(int transactionAdvance) {
		this.transactionAdvance = transactionAdvance;
	}

	public Date getTransactionTdate() {
		return transactionTdate;
	}

	public void setTransactionTdate(Date transactionTdate) {
		this.transactionTdate = transactionTdate;
	}

	public int getTransactionCancel() {
		return transactionCancel;
	}

	public void setTransactionCancel(int transactionCancel) {
		this.transactionCancel = transactionCancel;
	}

	public int getTransactionjarDel() {
		return transactionjarDel;
	}

	public void setTransactionjarDel(int transactionjarDel) {
		this.transactionjarDel = transactionjarDel;
	}

	public int getTransactionBotDel() {
		return transactionBotDel;
	}

	public void setTransactionBotDel(int transactionBotDel) {
		this.transactionBotDel = transactionBotDel;
	}

	public int getTransactionTotal() {
		return transactionTotal;
	}

	public void setTransactionTotal(int transactionTotal) {
		this.transactionTotal = transactionTotal;
	}

	@Override
	public String toString() {
		return "TransactionEntity [Id=" + Id + ", transactionUuid=" + transactionUuid + ", transactionCusUuid="
				+ transactionCusUuid + ", transactionCustName=" + transactionCustName + ", transactionAreaName="
				+ transactionAreaName + ", transactionAreaUuid=" + transactionAreaUuid + ", transactionjarPick="
				+ transactionjarPick + ", transactionBotPick=" + transactionBotPick + ", transactionjarDel="
				+ transactionjarDel + ", transactionBotDel=" + transactionBotDel + ", transactionJarRate="
				+ transactionJarRate + ", transactionBotRate=" + transactionBotRate + ", transactionAmount="
				+ transactionAmount + ", transactionTotal=" + transactionTotal + ", transactionPending="
				+ transactionPending + ", transactionAdvance=" + transactionAdvance + ", transactionTdate="
				+ transactionTdate + ", transactionCancel=" + transactionCancel + "]";
	}

	

	
	
	
	

}
