package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.ecommerce.Entites.Product;
import com.ecommerce.service.ProductDao;

@Controller
public class productController {
	@Autowired
	private ProductDao pd;
	
	@RequestMapping("/")
	public String home() {
		return "index";
		
	}
	@GetMapping("/findByproduct")
	public List<Product> findAll(){
		
		return this.pd.findAll();

		
	}
		
	
}