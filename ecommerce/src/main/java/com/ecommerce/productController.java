package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class productController {
	@Autowired
	private ProductServiceimp productService;
	
	@RequestMapping("/")
	public String home() {
		return "index";
		
	}
//	@RequestMapping("/findbyproduct")
//	public ModelAndView Find(@RequestParam String subcat) {
//		ModelAndView mv=new ModelAndView("showproducts");
//		
//		mv.addObject(productService.getAllProduct(subcat));
//		return mv;
//	}
	@RequestMapping("/mobile")
	public String FindMobile(String subcat ,Model m) {
		subcat="mobile";
		m.addAttribute("product",productService.getAllProduct(subcat));
		return "showproducts";
	}
	@RequestMapping("/ac")
	public String FindAC(String subcat ,Model m) {
		subcat="AC";
		m.addAttribute("product",productService.getAllProduct(subcat));
		return "showproducts";
	}
	@RequestMapping("/laptop")
	public String FindLaptop(String subcat ,Model m) {
		subcat="laptop";
		m.addAttribute("product",productService.getAllProduct(subcat));
		return "showproducts";
	}
	
		
}
