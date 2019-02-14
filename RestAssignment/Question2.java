package com.chaitali.rest.RestAssignment;

import javax.ws.rs.Path;


@Path("/check")
public class Question2 {

	/*POJO*/
	
	String userName, passWord;

	
	public Question2(){
		
	}
	
	public Question2(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "Question2 [userName=" + userName + ", passWord=" + passWord
				+ "]";
	}
	
	
}
