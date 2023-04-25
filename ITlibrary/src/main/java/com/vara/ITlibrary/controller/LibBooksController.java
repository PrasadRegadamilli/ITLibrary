package com.vara.ITlibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vara.ITlibrary.entity.LibBooks;
import com.vara.ITlibrary.repository.BooksRepository;
import com.vara.ITlibrary.service.AdminLoginService;
import com.vara.ITlibrary.service.LibBooksService;

@Controller
public class LibBooksController {
	@Autowired
	BooksRepository bookrepo;

	@Autowired
	AdminLoginService adminservice;

	@Autowired
	LibBooksService libBookService;

	@RequestMapping("/books")
	public String libBooks() {
		return "libBooks";
	}
    
	//adding books
	@RequestMapping("/submitBooks")
	public String submitBooks(LibBooks libBooks) {
		bookrepo.save(libBooks);
		return "libBooks";
	}
	
	//controller is used for showing all types of books except out of stock books
	@GetMapping("/retrieveBooks")
	public ModelAndView getBooks() {
		List<LibBooks> libBook = libBookService.getBooks();
		ModelAndView mv = new ModelAndView();
		mv.addObject("books", libBook);
		mv.setViewName("viewbooks");
		return mv;

	}

	
	//controller is used for showing all types of books include out of stock books in User account
	@GetMapping("/userBooksList")
	public ModelAndView getUserBooksList() {
		List<LibBooks> libBook = libBookService.getBooksList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("books", libBook);
		mv.setViewName("userBooksList");
		return mv;

	}
	
	//controller is used for showing all types of books include out of stock books in Admin account
		@GetMapping("/adminBooksList")
		public ModelAndView getAdminBooksList() {
			List<LibBooks> libBook = libBookService.getBooksList();
			ModelAndView mv = new ModelAndView();
			mv.addObject("books", libBook);
			mv.setViewName("adminBooksList");
			return mv;

		}
		
		@RequestMapping("/takeABooks")
		public String takeABook() 
		{
			return "takeABook";
		}
		
		//controller is used for Drop_Down list
		@GetMapping("/takeABook")
		public ModelAndView getDropDown() {
			List<LibBooks> libBook = libBookService.getBooks();
			ModelAndView mv = new ModelAndView();
			mv.addObject("avlBooks", libBook);
			mv.setViewName("takeABook");
			return mv;

		}
		

}
