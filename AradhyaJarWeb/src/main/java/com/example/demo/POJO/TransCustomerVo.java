package com.example.demo.POJO;

public class TransCustomerVo 
{
	private String acc_uuid;
	
	private String cusuuid;
	
	private String cusname;
	
	private String address;
	
	private Long mobile1;
	
	private Long mobile2;

	private int jar;
	
	private int bot;
	
	private int amount;

	public String getAcc_uuid() {
		return acc_uuid;
	}

	public void setAcc_uuid(String acc_uuid) {
		this.acc_uuid = acc_uuid;
	}

	public String getCusuuid() {
		return cusuuid;
	}

	public void setCusuuid(String cusuuid) {
		this.cusuuid = cusuuid;
	}

	public String getCusname() {
		return cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getMobile1() {
		return mobile1;
	}

	public void setMobile1(Long mobile1) {
		this.mobile1 = mobile1;
	}

	public Long getMobile2() {
		return mobile2;
	}

	public void setMobile2(Long mobile2) {
		this.mobile2 = mobile2;
	}

	public int getJar() {
		return jar;
	}

	public void setJar(int jar) {
		this.jar = jar;
	}

	public int getBot() {
		return bot;
	}

	public void setBot(int bot) {
		this.bot = bot;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "TransCustomerVo [acc_uuid=" + acc_uuid + ", cusuuid=" + cusuuid + ", cusname=" + cusname + ", address="
				+ address + ", mobile1=" + mobile1 + ", mobile2=" + mobile2 + ", jar=" + jar + ", bot=" + bot
				+ ", amount=" + amount + "]";
	}

	
}
