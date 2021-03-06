package com.chaitali.model;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "userAccount")
public class UserRegistrationAccount {
	
	/*{
		"userName":"Priya",
		"emailId":"cvs@gmail.com",
		"phoneNumber":"123456",
		"password":"cvs"
	}*/
	
	
	

	private String userName;
	
	@Id
	private String emailId;
	private long phoneNumber;
	private String password;
	//private List<Link> links=new ArrayList<>();
	
	
	public UserRegistrationAccount() {
		
	}
	
	/*public UserRegistrationAccount(String emailId,String password) {
		
		this.emailId = emailId;
		this.password = password;
	}*/

	public UserRegistrationAccount(String userName, String emailId, long phoneNumber, String password) {
		super();
		
		this.userName = userName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}



	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRegistrationAccount [userName=" + userName + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + "]";
	}
}
