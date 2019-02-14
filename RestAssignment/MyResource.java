package com.chaitali.rest.RestAssignment;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    /*@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    
	question2
	@POST
    @Produces(MediaType.TEXT_PLAIN)
    public String checkUser(@FormParam("username") String username,@FormParam("password") String password){
    	if(username.equals("chaitali")&&password.equals("123"))	
    		return "valid user";
    	else{
    			return "invalid";
    	}
    }*/
	EmplyoyeeService service= new EmplyoyeeService();
	
	@GET
    @Path("/getallemployee")
    @Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployees() {
		return service.getAllEmployee();
	}
	
	
	
}
