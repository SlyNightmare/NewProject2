package com.revature.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Account;
import com.revature.service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path="/account", produces=MediaType.APPLICATION_JSON_VALUE)
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	public ResponseEntity<Account> login(@RequestBody String[] loginDetails, HttpServletRequest request) {
		Account valid = loginService.login(loginDetails[0], loginDetails[1]);
		if(valid != null) {
			HttpSession session = request.getSession();
			session.setAttribute("accountId", valid.getId());
			System.out.println((Integer) session.getAttribute("accountId"));
			return new ResponseEntity<>(valid, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}