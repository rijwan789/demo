package com.cjc.service;

import java.util.List;

import com.cjc.model.Product;

public interface ProductService {
	
public List<Product> getAllProduct();
	
	
	public List<Product> getAllProductByName(String productName);


	public Product getProductId(int productId);
	


}
