package com.vara.ITlibrary.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vara.ITlibrary.entity.Registration;
import com.vara.ITlibrary.model.LoginAccess;

@Repository
public interface Repo extends JpaRepository<Registration, String> 
{
 
	
	@Query(value="Select user_name, user_password from Lib_register where user_name=:username and user_password =:password", nativeQuery = true)
	public List<Object[]> getLoginAccess(@Param("username") String username, @Param("password") String password);
}
