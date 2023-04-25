package com.vara.ITlibrary.model;

import org.springframework.stereotype.Component;

@Component
public class LoginAccess 
{
 private String username;
 private String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "LoginAccess [username=" + username + ", password=" + password + "]";
}
 
	
}
