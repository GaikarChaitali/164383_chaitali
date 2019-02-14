package com.chaitali.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chaitali.model.Cart;

public interface CartRepository extends MongoRepository<Cart, String>{

}
