package com.vara.ITlibrary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vara.ITlibrary.entity.AdminRegistration;
import com.vara.ITlibrary.entity.LibBooks;
import com.vara.ITlibrary.entity.Registration;

@Repository
public interface AdminRepo extends JpaRepository<AdminRegistration, Integer> 
{

	@Query(value = "select Admin_Id, Admin_Password from Admin_Registration where Admin_Id=:Id And Admin_Password=:password", nativeQuery = true)
	public List<Object[]> getAdminLogin(@Param("Id") int Id, @Param("password") String password);
	
	@Query(value = "select count(*) from Lib_books where stock >0", nativeQuery = true)
	public int getstock();
	
	@Query(value = "select * from Lib_Register", nativeQuery = true)
	public List<Registration> getUser();
	
}
