package com.example.demo.POJO;

public class UserLoggVo 
{
	private String useremail;
	private String userUUID;
	private String userName;
	private String userMob;
	private long catche;
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserUUID() {
		return userUUID;
	}
	public void setUserUUID(String userUUID) {
		this.userUUID = userUUID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMob() {
		return userMob;
	}
	public void setUserMob(String userMob) {
		this.userMob = userMob;
	}
	
	
	public long getCatche() {
		return catche;
	}
	public void setCatche(long catche) {
		this.catche = catche;
	}
	@Override
	public String toString() {
		return "UserLoggVo [useremail=" + useremail + ", userUUID=" + userUUID + ", userName=" + userName + ", userMob="
				+ userMob + ", catche=" + catche + "]";
	}
	public UserLoggVo(String useremail, String userUUID, String userName, String userMob, long captcha) {
		super();
		this.useremail = useremail;
		this.userUUID = userUUID;
		this.userName = userName;
		this.userMob = userMob;
		this.catche = captcha;
	}
	public UserLoggVo() {
		super();
	}
	
	

}
