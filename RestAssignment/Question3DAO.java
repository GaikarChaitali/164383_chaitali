package com.chaitali.rest.RestAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question3DAO {

	
	public Map<Long , Question3> printDetails(){
	Map<Long , Question3> map=new HashMap<Long, Question3>();
	
	map.put((long) 123, new Question3("maharashtra", "panvel", "India"));
	map.put((long) 99501, new Question3("AK", "ANCHORAGE", "US"));
	
	
	return map;
	}
	
	
	
	
	
}
