package com.chaitali.model;

public class UserLoginAccount {
	
	private String emailId;
	private String password;
	
	
	public UserLoginAccount() {
		
	}
	
	
	public UserLoginAccount(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserLoginAccount [emailId=" + emailId + ", password=" + password + "]";
	}
	
	
}
