package com.edu.java.cap8;

public class LoginForm {
	boolean logged = false;
	String username, password;
	
	public LoginForm(String user, String pwd) {
		username = user;
		password = pwd;
	}
	
	public void input(String text) {
		String[] creds = text.split(",", 2);
		
		if (creds[0].equals(username) && creds[1].equals(password)) {
			logged = true;
		}
	}
	
	public void click(String button) {
		if (button.equals("reset")) {
			logged = false;
		}		
	}
	
	public boolean loggedIn() {
		return logged;
	}

	
}
