package com.teamf.cricket.domain;

import java.io.Serializable;

public class Players implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1552273194464932305L;
	private Long id;
	private String fname;
	private String lname;
	private String dob;
	private String type;
	private String state;
	private String year_of_joining;
	private double height;
	private String description;
	private String status;
	private String imageurl;
	
	
	
	public Players() {
		super();
	}
	
	
	
		
	
	
	public Players(Long id, String fname, String lname, String dob,
			String type, String state, String year_of_joining, double height,
			String description, String status, String imageurl) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.type = type;
		this.state = state;
		this.year_of_joining = year_of_joining;
		this.height = height;
		this.description = description;
		this.status = status;
		this.imageurl = imageurl;
	}







	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getYear_of_joining() {
		return year_of_joining;
	}
	public void setYear_of_joining(String year_of_joining) {
		this.year_of_joining = year_of_joining;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Players [id=" + id + ", fname=" + fname + ", lname=" + lname
				+ ", dob=" + dob + ", type=" + type + ", state=" + state
				+ ", year_of_joining=" + year_of_joining + ", height=" + height
				+ ", description=" + description + ", status=" + status
				+ ", imageurl=" + imageurl + "]";
	}
	
	
	
	
	
	
	
	
	
	
}