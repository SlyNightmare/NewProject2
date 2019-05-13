package com.revature.service;

import com.revature.model.Account;

public interface LoginService{

	Account login(String username, String password);
}
