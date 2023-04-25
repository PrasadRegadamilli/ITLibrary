package com.vara.ITlibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vara.ITlibrary.entity.AdminRegistration;
import com.vara.ITlibrary.entity.Registration;
import com.vara.ITlibrary.repository.AdminRepo;
import com.vara.ITlibrary.repository.Repo;
import com.vara.ITlibrary.service.AdminLoginService;
import com.vara.ITlibrary.service.LibBooksService;

@Controller
public class AdminController {

	@Autowired
	AdminRepo adminrepo;

	@Autowired
	AdminLoginService adminservice;

	@Autowired
	Repo repo;

	@Autowired
	LibBooksService libBookService;

	@RequestMapping("/adminhome")
	public String adminhome() {
		return "adminhome";
	}

	@GetMapping("/retrieveUsers")

	public ModelAndView getUsers() {
		ModelAndView mv = new ModelAndView();
		List<Registration> user = adminservice.getUsers();
		mv.addObject("users", user);
		mv.setViewName("viewUsers");
		return mv;
	}

	@RequestMapping("/adminlogin")
	public String adminLogin() {
		return "adminLogin";
	}

	@RequestMapping("/adminRegistration")
	public String adminRegistration() {
		return "adminRegistration";
	}

	@RequestMapping("/adminDetails")
	public String adminDetails(AdminRegistration adminRegisration) {
		adminrepo.save(adminRegisration);
		return "adminhome";
	}

	@RequestMapping("/submitAdminLogin")
	public ModelAndView submitAdminLogin(@RequestParam int Id, @RequestParam String password) {
		ModelAndView mv = new ModelAndView();

		int adminresult = adminservice.adminLogin(Id, password);
		if (adminresult == 1) {
			int stock = libBookService.getStock();
			System.out.println(stock);
			mv.addObject("stock", stock);
			mv.setViewName("adminhome");
			return mv;
		} else {
			mv.setViewName("adminRegistration");
			return mv;
		}

	}
}
