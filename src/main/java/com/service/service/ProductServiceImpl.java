package com.service.service;

import org.springframework.stereotype.Service;

import com.service.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	ProductRepository productRepository;
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

}
