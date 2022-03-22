package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ecommerce.Entites.Product;
@Lazy
@Service
public class ProductService implements ProductRepo {
	
	@Autowired
	private  ProductRepo productRepo;

    

		@Override
		public List<Product> findAll() {
			return productRepo.findAll();
		}

		@Override
		public List<Product> findByType(String p_type) {
			return productRepo.findByType(p_type);
		}

		@Override
		public List<Product> findByCategory(String c_type) {
			return productRepo.findByCategory(c_type);
		}
}
