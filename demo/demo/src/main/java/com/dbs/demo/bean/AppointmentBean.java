package com.dbs.demo.bean;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dbs_tbl_appointments")
public class AppointmentBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int appID;
	String appFrom;
	String appTo;
	String description;
	String branch;
	String owner;
	String date;
	public AppointmentBean(String appFrom, String appTo, String description, String branch, String owner, String date) {
		super();
		//this.appID = appID;
		this.appFrom = appFrom;
		this.appTo = appTo;
		this.description = description;
		this.branch = branch;
		this.owner = owner;
		this.date = date;
	}

	/*public int getAppID() {
		return appID;
	}

	public void setAppID(int appID) {
		this.appID = appID;
	}*/

	public String getAppFrom() {
		return appFrom;
	}

	public void setAppFrom(String appFrom) {
		this.appFrom = appFrom;
	}

	public String getAppTo() {
		return appTo;
	}

	public void setAppTo(String appTo) {
		this.appTo = appTo;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	

	public AppointmentBean() {
		// TODO Auto-generated constructor stub
	}

}
