package com.chaitali.rest.RestAssignment;

import java.util.ArrayList;

public class Question2DAO {

	ArrayList<Question2> user=new ArrayList<Question2>();
	
	
	public Question2DAO(){
		
		user.add(new Question2("chaitali","123"));
		
	}


	public ArrayList<Question2> getUser() {
		return user;
	}


	public void setUser(ArrayList<Question2> user) {
		this.user = user;
	}
	
}
