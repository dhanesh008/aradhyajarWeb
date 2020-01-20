package com.example.demo.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_master")
public class AdminEntity implements Serializable{

	/**
	 * Author:Dhaneshkumar Solanki
	 */
	private static final long serialVersionUID = 5199089337842954229L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sr_no")
	private int srno;
	
	@Column(name="admin_uuid")
	private String adminUuid=UUID.randomUUID().toString();
	
	@Column(name="admin_email")
	private String adminEmail;
	
	@Column(name="admin_name")
	private String adminName;
	
	@Column(name="admin_password")
	private String adminPassword;
	
	@Column(name="admin_tdate")
	private Date adminTdate;
	
	@Column(name="admin_mobileno")
	private String adminmobno;
	
	@Column(name="admin_status")
	private String adminStatus;
	
	@Column(name="admin_otp")
	private long adminOTP;

	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	

	public String getAdminUuid() {
		return adminUuid;
	}

	public void setAdminUuid(String adminUuid) {
		this.adminUuid = adminUuid;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public Date getAdminTdate() {
		return adminTdate;
	}

	public void setAdminTdate(Date adminTdate) {
		this.adminTdate = adminTdate;
	}

	public String getAdminmobno() {
		return adminmobno;
	}

	public void setAdminmobno(String adminmobno) {
		this.adminmobno = adminmobno;
	}

	public String getAdminStatus() {
		return adminStatus;
	}

	public void setAdminStatus(String adminStatus) {
		this.adminStatus = adminStatus;
	}

	public long getAdminOTP() {
		return adminOTP;
	}

	public void setAdminOTP(long adminOTP) {
		this.adminOTP = adminOTP;
	}

	@Override
	public String toString() {
		return "AdminEntity [srno=" + srno + ", adminUuid=" + adminUuid + ", adminEmail=" + adminEmail + ", adminName="
				+ adminName + ", adminPassword=" + adminPassword + ", adminTdate=" + adminTdate + ", adminmobno="
				+ adminmobno + ", adminStatus=" + adminStatus + ", adminOTP=" + adminOTP + "]";
	}

	
	
	
	
}
