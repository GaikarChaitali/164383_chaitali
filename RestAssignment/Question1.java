package com.chaitali.rest.RestAssignment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class Question1 {

	 @GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String getIt() {
	        return "Hello World!";
	    }
	
}
