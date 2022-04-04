package com.example.EAS.mvcController;

import java.util.List;
import com.example.EAS.entity.Admin;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.EAS.service.MainService;

@Controller
public class MvcController {

	@Autowired
	MainService mainService;
	
	@RequestMapping("/")
	public String home() {
		return "index";
		
	}
	@RequestMapping(value = "/admin")
	public String Admin(Model m, HttpServletRequest req) {
		try {
		//String username=req.getParameter("username");
		int pass=Integer.parseInt(req.getParameter("pass"));
		if(pass==1234) {
			
			List<Admin> ad=mainService.AllDetails();
			m.addAttribute("ad",ad);
			return "admin";
		}
	else {
		
		return "wpass";
	}
		}catch (Exception e) {
			return "wpass";
		}
	}
	@RequestMapping(value = "/employee")
	public String employee(HttpServletRequest req,Model m) {
	
	try {	int id=Integer.parseInt(req.getParameter("id"));
		mainService.Pmark(id);
		m.addAttribute("name",mainService.findemp(id));
		return "employee";
	}catch (Exception e) {
		return "wpass";
	}
	}
	
}
