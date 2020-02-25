package com.aciworldwide.acisportsstoreapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aciworldwide.acisportsstoreapi.model.Product;
import com.aciworldwide.acisportsstoreapi.services.OrderService;
import com.aciworldwide.acisportsstoreapi.services.ProductService;

@RestController //Rest controller always provide json data, it will never return viewType object
@RequestMapping("/api/products")
@CrossOrigin(origins="http://localhost:4200")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/all")
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	
	
//	@Autowired
//	private OrderService orderService;
//	
//	@GetMapping("/order")
//	public List<Product> orderProducts(){
//		return orderService.getOrders();
//	}

	
	
}
