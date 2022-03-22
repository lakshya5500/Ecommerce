package com.ecommerce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



@Service
public class ProductServiceimp {
	
	@Autowired
	private ProductRepo productRepo;
	
//	public List<Product> list;
	
//	public List<Product> getAllProductDetails(){
//		
//		return list;
//	}

		public List<Product> getAllProductDetails(){
			return productRepo.findAll();
		}
		
		public List<Product> getAllProductByType(String p_type){
			return productRepo.findBysubcat(p_type);
		}
		public List<Product> getAllProductByCategory(String c_type){
			return productRepo.findBycat(c_type);
		}
}
