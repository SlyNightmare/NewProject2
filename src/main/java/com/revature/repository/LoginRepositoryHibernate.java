package com.revature.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Account;

@Repository("loginRepository")
@Transactional
public class LoginRepositoryHibernate implements LoginRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Account findAccount(String username, String password) {
		return (Account) sessionFactory.getCurrentSession().createCriteria(Account.class)
				.add(Restrictions.like("username", username))
				.add(Restrictions.like("password", password))
				.list().get(0);
		
	}

	@Override
	public List<String> getAccount(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	

}