package com.ecom.api.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.api.entity.Cart;
import com.ecom.api.entity.Product;
import com.ecom.api.repository.CartRepo;
import com.ecom.api.repository.ProductRepo;

@Service
public class MainService {
	
	@Autowired
	public CartRepo cartRepo;
	@Autowired
	public ProductRepo productRepo;
	
	public List<Product> getmobile() {		
		return productRepo.findBymobile();
	}
	public List<Product> getlaptop() {		
		return productRepo.findBylaptop();
	}
	public List<Product> getac() {		
		return productRepo.findByac();
	}
	
	public Product name(String pname) {
		return productRepo.findBypname(pname);
	}
	
	public List<Cart> details() {
		return cartRepo.findAll();
	}
	
	
	
}
