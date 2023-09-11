package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Product;
import com.cjc.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService pser;
	
	@GetMapping("/products")
	public List<Product> getAllProduct(){
		
		return pser.getAllProduct();
	}
	
	@GetMapping("/products/productName/{productName}")
	public List<Product> getAllProductName(@PathVariable String productName){
	
		return pser.getAllProductByName(productName);
	}
	
	@GetMapping("/products/{productId}")
	public Product getProductById(@PathVariable int productId) {
		
		return pser.getProductId(productId);
	}
	
	@GetMapping("/user")
	public String getUserAuthentication() {
		
		return "User Authenticated Successfull";
		
	}
	

}
