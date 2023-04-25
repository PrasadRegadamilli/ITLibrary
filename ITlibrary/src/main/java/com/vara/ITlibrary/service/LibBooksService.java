package com.vara.ITlibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vara.ITlibrary.entity.LibBooks;
import com.vara.ITlibrary.repository.AdminRepo;
import com.vara.ITlibrary.repository.BooksRepository;

@Service
public class LibBooksService {
	@Autowired
	AdminRepo adminrepo;

	@Autowired
	BooksRepository bookRepo;

	public int getStock() {
		int stock = adminrepo.getstock();
		return stock;
	}

	public List<LibBooks> getBooks() {
		List<LibBooks> libBooks = bookRepo.getBooks();
		return libBooks;
	}
	
	public List<LibBooks> getBooksList() {
		List<LibBooks> libBooks = bookRepo.getBooksList();
		return libBooks;
	}
}
