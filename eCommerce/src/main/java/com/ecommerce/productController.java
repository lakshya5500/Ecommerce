package com.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class productController {
	@Autowired
	private ProductServiceimp productService;
	
	@RequestMapping("/")
	public String home() {
		return "index";
		
	}
	@RequestMapping("/findByproduct")
	public ModelAndView Find() {
		ModelAndView mv=new ModelAndView("showproducts");
		
		mv.addObject(productService.getAllProductDetails());
		return mv;
		
}
}