package com.chaitali.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chaitali.model.UserRegistrationAccount;

public interface UserRepository extends MongoRepository<UserRegistrationAccount, String>
{
	
}
