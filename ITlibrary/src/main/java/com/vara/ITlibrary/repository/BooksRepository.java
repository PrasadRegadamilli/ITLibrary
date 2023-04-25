package com.vara.ITlibrary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vara.ITlibrary.entity.LibBooks;

@Repository
public interface BooksRepository extends JpaRepository<LibBooks, String> 
{


	@Query(value = "select * from Lib_books where stock>0", nativeQuery = true)
	public List<LibBooks> getBooks();
	
	@Query(value = "select * from Lib_books", nativeQuery = true)
	public List<LibBooks> getBooksList();
}
