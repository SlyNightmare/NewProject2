package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Account;
import com.revature.repository.LoginRepository;

@Service
public class LoginServiceAlpha implements LoginService {

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public Account login(String username, String password) {
		return loginRepository.findAccount(username, password);
	}


}
