package com.thingtrack.poc.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.thingtrack.poc.domain.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {
	public List<Product> findAll();
}
