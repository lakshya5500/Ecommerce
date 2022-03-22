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
//	@RequestMapping("/findbyproduct")
//	public ModelAndView Find(@RequestParam String subcat) {
//		ModelAndView mv=new ModelAndView("showproducts");
//		
//		mv.addObject(productService.getAllProduct(subcat));
//		return mv;
//	}
	@RequestMapping("/findbyproduct")
	public String FindAll(@RequestParam String subcat ,Model m) {
		m.addAttribute("product",productService.getAllProduct(subcat));
		return "showproducts";
	}
}
