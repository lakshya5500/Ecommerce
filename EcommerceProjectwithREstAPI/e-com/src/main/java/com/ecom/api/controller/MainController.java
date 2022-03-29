package com.ecom.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.api.entity.Cart;
import com.ecom.api.entity.Product;
import com.ecom.api.service.MainService;

@RestController
public class MainController {
	
	@Autowired
	MainService mainService;
	
	
	@GetMapping("/mobile")
	public List<Product> findmobile(){
		return mainService.getmobile();
	}
	@GetMapping("/ac")
	public List<Product> findac(){
		return mainService.getac();
	}
	@GetMapping("/laptop")
	public List<Product> findlaptop(){
		return mainService.getlaptop();
	}
	
	@GetMapping("/mobile/{pname}")
	public Product findbymobilename(@PathVariable String pname){
		return mainService.name(pname);
	}
	@GetMapping("/ac/{pname}")
	public Product findbyacname(@PathVariable String pname){
		return mainService.name(pname);
	}
	@GetMapping("/laptop/{pname}")
	public Product findlaptopname(@PathVariable String pname){
		return mainService.name(pname);
	}
	
	@GetMapping("/cart")
	public List<Cart> bill() {
		return mainService.details();
	}
	

}
