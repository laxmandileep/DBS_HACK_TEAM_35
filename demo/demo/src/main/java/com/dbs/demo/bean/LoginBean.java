package com.dbs.demo.bean;

public class LoginBean {

	String mailId;
	String password;
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public LoginBean(String mailId, String password) {
		super();
		this.mailId = mailId;
		this.password = password;
	}
	public LoginBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
