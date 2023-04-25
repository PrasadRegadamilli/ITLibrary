package com.vara.ITlibrary.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.vara.ITlibrary.entity.Registration;
import com.vara.ITlibrary.model.LoginAccess;
import com.vara.ITlibrary.repository.Repo;

@Service
public class LoginService 
{

@Autowired
Repo repo;
public int loginAccess(String username, String password) 
{
	List<Object[]> access= repo.getLoginAccess(username, password);
	if (access.isEmpty()) 
	{
		return 0;
	}
	else 
	{
		Object[] singleobj=access.get(0);
		
		if(Objects.isNull(singleobj))
		{
			return 0;
		}
		else
		{
			return 1;
		}
		
	}
	
	
	
}
}
