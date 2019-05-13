package com.revature.util;

import com.revature.ajax.ClientMessage;

public class ClientMessageUtil {

	public static final ClientMessage LOGIN_SUCCESSFUL = new ClientMessage("Logged in successfully.");
	public static final ClientMessage SOMETHING_WENT_WRONG = new ClientMessage("Something went wrong.");
	public static final ClientMessage LOGOUT_SUCCESSFUL = new ClientMessage("Logged out successfully");
	public static final ClientMessage LOGOUT_UNSUCCESSFUL = new ClientMessage("Log out failed");
	public static final ClientMessage REGISTRATION_SUCCESSFUL = new ClientMessage("Registered successfully");
}
