package com.dbs.demo.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "dbs_tbl_appointments")
public class AppointmentBean {

	
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int appID;
	String from;
	String to;
	String description;
	String branch;
	String owner;

	public AppointmentBean(String from, String to, String description, String branch, String owner, Date date) {
		super();
		this.from = from;
		this.to = to;
		this.description = description;
		this.branch = branch;
		this.owner = owner;
		this.date = date;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@DateTimeFormat(pattern="dd/MM/yyyy")
	Date date;

	public AppointmentBean() {
		// TODO Auto-generated constructor stub
	}

}
