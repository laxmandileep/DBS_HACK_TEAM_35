package com.dbs.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * bean class for customer which holds customer details
 */
@Entity
@Table(name = "dbs_tbl_customer")
public class CustomerBean {

	public CustomerBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	String mailID;

	public CustomerBean(String mailID, String name, String password, long mobile) {
		super();
		this.mailID = mailID;
		this.name = name;
		this.password = password;
		this.mobile = mobile;
	}

	String name;

	public String getMailID() {
		return mailID;
	}

	public void setMailID(String mailID) {
		this.mailID = mailID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	String password;
	long mobile;

}
