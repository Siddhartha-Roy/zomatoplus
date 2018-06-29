package com.thinkxfactor.zomatoplus.models;

public class MyUSerLogin extends MyUser {
	private String usernameLogin;
	private String passwordLogin;
	public MyUSerLogin() {
		super();
		
	}
	public MyUSerLogin(String username, String password) {
		super(username, password);
		this.usernameLogin=usernameLogin;
		this.passwordLogin=passwordLogin;
		super.check(usernameLogin, passwordLogin);
		
	}
	public String getUsernameLogin() {
		return usernameLogin;
	}
	public void setUsernameLogin(String usernameLogin) {
		this.usernameLogin = usernameLogin;
	}
	public String getPasswordLogin() {
		return passwordLogin;
	}
	public void setPasswordLogin(String passwordLogin) {
		this.passwordLogin = passwordLogin;
	}
	
}
	
	
	

	

