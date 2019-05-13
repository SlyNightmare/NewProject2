package com.revature.repository;

import java.util.List;

import com.revature.model.Account;

public interface LoginRepository {

	Account findAccount(String username, String password);
	
	public List<String> getAccount(String username);
	
}
