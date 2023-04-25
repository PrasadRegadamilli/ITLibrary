package com.vara.ITlibrary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin_Registration")
public class AdminRegistration 
{
    @Id
    @Column(name="Admin_Id")
	private int Id;
    
    @Column(name="Admin_Name")
    private String name;
    
    @Column(name="Admin_Password")
    private String password;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	@Override
	public String toString() {
		return "AdminRegistration [Id=" + Id + ", name=" + name + ", password=" + password + "]";
	}
    
}
