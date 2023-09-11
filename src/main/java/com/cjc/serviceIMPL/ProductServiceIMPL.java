package com.cjc.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.ProductRepository;
import com.cjc.model.Product;
import com.cjc.service.ProductService;

@Service
public class ProductServiceIMPL implements ProductService {
	
	@Autowired
	private ProductRepository prepo;
	
	@Override
	public List<Product> getAllProduct() {
		
		return prepo.findAll();
	}

	@Override
	public List<Product> getAllProductByName(String productName) {

		return prepo.findByProductName(productName);
	}

	@Override
	public Product getProductId(int productId) {
	
		return prepo.findById(productId).get();
	}
	

}
