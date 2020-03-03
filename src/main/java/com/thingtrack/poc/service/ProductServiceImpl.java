package com.thingtrack.poc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.thingtrack.poc.domain.Product;
import com.thingtrack.poc.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	 
	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}
}
