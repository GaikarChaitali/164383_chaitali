package com.chaitali.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.web.bind.annotation.CrossOrigin;*/
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chaitali.model.UserLoginAccount;
import com.chaitali.model.UserRegistrationAccount;
import com.chaitali.service.UserService;







/*@CrossOrigin(origins="http://localhost:4400")*/
@RestController
@RequestMapping("/quickr")
public class UserController {
	
@Autowired
private UserService userService;
	
	
	@PostMapping("/users/create")
	public void createUser(@RequestBody UserRegistrationAccount userRegistrationAccount) {
		userService.createUser(userRegistrationAccount);
			
	}
	
	@PostMapping("/users/login")
	public String validateUser(@RequestBody UserLoginAccount userLoginAccount) {
		System.out.println(userService.validateUser(userLoginAccount));
		return userService.validateUser(userLoginAccount);
		
	}
	
	@GetMapping("/users")
	public List<UserRegistrationAccount> getAllUsers() {
		System.out.println("Get all Users...");
		
		return userService.getAllUsers();
	}
	
	@GetMapping("/users/{email}")
	public Optional<UserRegistrationAccount> getUserByEmail(@PathVariable String email) {
		System.out.println("Get sprcific User by email...");
		return userService.getUserByEmail(email);
	}
	@DeleteMapping("/users/delete")
	public void deleteAllUsers() {
		System.out.println("Delete All Users...");
 
		userService.deleteAllUsers();
	}
	
	@DeleteMapping("/users/delete/{email}")
	public void deleteUser(@PathVariable("email") String email) {
		System.out.println("Delete specific User...");
 
		userService.deleteUser(email);
	}


	

}

