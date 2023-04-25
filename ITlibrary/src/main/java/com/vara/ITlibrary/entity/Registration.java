package com.vara.ITlibrary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Lib_Register")
public class Registration {
	@Id
	@Column(name="User_Name")
	private String username;
	
	@Column(name="Mobile")
	private long mobile;
	
	@Column(name="Email_Id")
	private String email;
	
	@Column(name="User_Password")
	private String createpassword;
	
	@Column(name="Address")
	private String address;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreatepassword() {
		return createpassword;
	}

	public void setCreatepassword(String createpassword) {
		this.createpassword = createpassword;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Registration [username=" + username + ", mobile=" + mobile + ", email=" + email + ", createpassword="
				+ createpassword + ", address=" + address + "]";
	}
	

}
