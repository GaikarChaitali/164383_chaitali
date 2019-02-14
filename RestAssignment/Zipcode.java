package com.chaitali.rest.RestAssignment;

import java.util.Map;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
;




@Path("{zipcode}")
public class Zipcode {

	Question3DAO dao=new Question3DAO();
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String showInfo(@FormParam("zipcode") long zipcode){
		
		 for (Map.Entry<Long,Question3> entry :dao.printDetails().entrySet())  {
			 
			 if (zipcode==entry.getKey()) {
				 Question3 info=entry.getValue();
				  return "Value is "+info;
			}  
	            
		 }//for loop ends here
	          
	 return "Enter Valid zipcode";
	}
	
}

	

