package com.vara.ITlibrary.model;

import org.springframework.stereotype.Component;

@Component
public class AdminLogin 
{

	private int Id;
	private String password;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminLogin [Id=" + Id + ", password=" + password + ", getId()=" + getId() + ", getPassword()="
				+ getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
