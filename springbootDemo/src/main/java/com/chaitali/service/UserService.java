package com.chaitali.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.chaitali.model.UserLoginAccount;
import com.chaitali.model.UserRegistrationAccount;
import com.chaitali.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void createUser(UserRegistrationAccount userRegistrationAccount) {
		 
	//userRepository.save(new UserAccount(userAccount.getUserName(), userAccount.getEmailId(),userAccount.getPhoneNumber(),userAccount.getPassword()));
		System.out.println( "saved in database");
		userRepository.save(userRegistrationAccount);
		
	}

	public String validateUser(UserLoginAccount userLoginAccount) {

		List<UserRegistrationAccount> users=userRepository.findAll();
		for(UserRegistrationAccount user:users) {
			if(user.getEmailId().equals(userLoginAccount.getEmailId()) && user.getPassword().equals(userLoginAccount.getPassword())) {
				return "Login Success!";
			}
		}
		return "login failed";
		
	}

	public List<UserRegistrationAccount> getAllUsers() {
		 
		List<UserRegistrationAccount> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
 
		return users;
	}

	public Optional<UserRegistrationAccount> getUserByEmail(String email) {
		System.out.println(email);
		return userRepository.findById(email);
	}

	public void deleteAllUsers() {
		
		userRepository.deleteAll();
	}

	public void deleteUser(String email) {
		userRepository.deleteById(email);
		
	}
	

	/*public Optional<UserRegistrationAccount> getUserByName(String userName) {
		System.out.println(userName);
		Optional<UserRegistrationAccount> users = userRepository.findById
				//.getUserByName(userName);
		System.out.println(users);
		return users;
	}*/
}
