package com.example.demo.POJO;

public class ResultVo 
{
	String msg;
	int result;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "ResultVo [msg=" + msg + ", result=" + result + "]";
	}

	
}
