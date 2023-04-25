package com.vara.ITlibrary.controller;

import com.vara.ITlibrary.*;
import com.vara.ITlibrary.entity.AdminRegistration;
import com.vara.ITlibrary.entity.LibBooks;
import com.vara.ITlibrary.entity.Registration;
import com.vara.ITlibrary.repository.AdminRepo;
import com.vara.ITlibrary.repository.BooksRepository;
import com.vara.ITlibrary.repository.Repo;
import com.vara.ITlibrary.service.AdminLoginService;
import com.vara.ITlibrary.service.LoginService;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	Repo repo;

	@Autowired
	LoginService service;

	@RequestMapping("/")
	public String welcomepage() {
		return "welcomeLibrary";
	}

	@RequestMapping("/login")
	public String loginForm() {
		return "login";
	}

	@RequestMapping("/registration")
	public String registrationForm() {
		return "registration";
	}

	@RequestMapping("/submitDetails")
	public String submitDetails(Registration registration) {
		repo.save(registration);
		return "login";
	}

	@RequestMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}

	@PostMapping("/submitLogin")
	public String loginAccess(@RequestParam String username, @RequestParam String password) {
		int result = service.loginAccess(username, password);
		if (result == 1) {
			return "redirect:/dashboard";
		} else {
			return "redirect:/registration";
		}

	}
}
