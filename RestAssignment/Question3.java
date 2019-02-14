package com.chaitali.rest.RestAssignment;

public class Question3 {

	String state,city,country;
    
    
    
    public Question3(){
    	
    }
    
	public Question3(String state, String city, String country) {
		this.state = state;
		this.city = city;
		this.country = country;
		
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Question3 [state=" + state + ", city=" + city + ", country="
				+ country + "]";
	}

    
    
}
