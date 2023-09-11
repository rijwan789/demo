package com.cjc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	public List<Product> findByProductName(String productName);


}
