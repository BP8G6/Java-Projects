package com.balakrishna.flickr.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;




@NamedQueries({
	@NamedQuery(name = "getUserPwd", query = "select u from UserDetails u where u.email=:pemail and password=:ppwd")

})

@Entity
@Table(name="ponnam_flickr_user")
public class UserDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4743866183058590746L;

	
	@Id
	@Column(name="userid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String userId;

	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="passwords")
	private String password;
	
	@Column(name="mobilenumber")
	private int mobileNumber;
	
	@Column(name="dob")
	private String dob;
	
	
	

	public UserDetails() {
		super();
	}

	public UserDetails(String firstName, String lastName, String email,
			String password, int mobileNumber, String dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.dob = dob;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", mobileNumber=" + mobileNumber + ", dob=" + dob
				+ "]";
	}

	
	
	
}
