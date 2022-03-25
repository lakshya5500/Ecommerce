package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.service.ProductServiceimp;

@Controller
public class productController {
	@Autowired
	private ProductServiceimp productService;

	@RequestMapping("/")
	public String home() {
		return "index";

	}

	@RequestMapping("/mobile")
	public String FindMobile(String subcat, Model m) {
		subcat = "mobile";
		m.addAttribute("product", productService.getAllProduct(subcat));
		return "mobile";
	}

	@RequestMapping("/ac")
	public String FindAC(String subcat, Model m) {
		subcat = "AC";
		m.addAttribute("product", productService.getAllProduct(subcat));
		return "ac";
	}

	@RequestMapping("/laptop")
	public String FindLaptop(String subcat, Model m) {
		subcat = "laptop";
		m.addAttribute("product", productService.getAllProduct(subcat));
		return "laptop";
	}

	@RequestMapping("/cart")
	public String Cart() {
		return "cart";
	}
	@RequestMapping("/checkout")
	public String Checkout() {
		return "checkout";
	}
	@RequestMapping("/success")
	public String Success() {
		return "success";
	}
}
