package com.revature.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.ajax.ClientMessage;
import static com.revature.util.ClientMessageUtil.LOGOUT_SUCCESSFUL;
import static com.revature.util.ClientMessageUtil.LOGOUT_UNSUCCESSFUL;


@RestController
public class LogoutController {

	@GetMapping("/logout")
	public ResponseEntity<ClientMessage> logout(HttpServletRequest request){
		HttpSession session = request.getSession(false);
		if(session != null) {
			session.invalidate();
			return new ResponseEntity<>(LOGOUT_SUCCESSFUL, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(LOGOUT_UNSUCCESSFUL, HttpStatus.BAD_REQUEST);
		}
	}
}
