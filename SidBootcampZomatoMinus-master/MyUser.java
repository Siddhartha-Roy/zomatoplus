package com.thinkxfactor.zomatoplus.models;
import java.io.Serializable;

public class MyUser implements Serializable {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public MyUser()
	{
		super();
	}
	

	public void setUsername(String username) {
		this.username = username;
	}
	public MyUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void check(String u, String p) {
		if((u.equals(username)&&(p.equals(password))==false))
				System.out.println("invalid userid or password");
	}
	

}
