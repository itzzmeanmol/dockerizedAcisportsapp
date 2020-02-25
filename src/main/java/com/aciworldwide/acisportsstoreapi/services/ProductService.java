package com.aciworldwide.acisportsstoreapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.aciworldwide.acisportsstoreapi.model.Product;
import com.aciworldwide.acisportsstoreapi.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public List<Product> getProducts() {
		return repository.findAll();
	}

	public Product getProduct(long id) {
		return repository.findById(id).get();
	}

	

}
