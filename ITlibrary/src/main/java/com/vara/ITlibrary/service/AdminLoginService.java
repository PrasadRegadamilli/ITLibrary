package com.vara.ITlibrary.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vara.ITlibrary.entity.LibBooks;
import com.vara.ITlibrary.entity.Registration;
import com.vara.ITlibrary.model.AdminLogin;
import com.vara.ITlibrary.repository.AdminRepo;
import com.vara.ITlibrary.repository.BooksRepository;

@Service
public class AdminLoginService {
	@Autowired
	AdminRepo adminrepo;

	public int adminLogin(int Id, String password) {
		List<Object[]> login = adminrepo.getAdminLogin(Id, password);

		if (login.isEmpty()) {
			return 0;

		} else {

			Object[] obj = login.get(0);

			if (Objects.isNull(obj))

			{

				return 0;

			}

			else

			{

				return 1;

			}

		}

	}

	public List<Registration> getUsers() {
		List<Registration> users = adminrepo.getUser();
		return users;
	}

}
