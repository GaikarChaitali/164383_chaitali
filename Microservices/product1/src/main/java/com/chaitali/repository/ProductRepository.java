package com.chaitali.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chaitali.model.Product;

public interface ProductRepository extends MongoRepository<Product,Integer>{

}
