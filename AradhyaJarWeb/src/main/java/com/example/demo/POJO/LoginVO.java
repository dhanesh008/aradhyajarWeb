package com.example.demo.POJO;

public class LoginVO 
{
	private ResultVo resultVo;
	private UserLoggVo userLoggVo;
	public ResultVo getResultVo() {
		return resultVo;
	}
	public void setResultVo(ResultVo resultVo) {
		this.resultVo = resultVo;
	}
	public UserLoggVo getUserLoggVo() {
		return userLoggVo;
	}
	public void setUserLoggVo(UserLoggVo userLoggVo) {
		this.userLoggVo = userLoggVo;
	}
	@Override
	public String toString() {
		return "LoginVO [resultVo=" + resultVo + ", userLoggVo=" + userLoggVo + "]";
	}
	
	

}
