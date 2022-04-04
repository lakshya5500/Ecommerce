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
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String Admin(Model m) {
		List<Admin> ad=mainService.AllDetails();
		m.addAttribute("ad",ad);
		return "admin";
	}
	@RequestMapping("/employee")
	public String employee(HttpServletRequest req) {
		int id=Integer.parseInt(req.getParameter("id"));
		mainService.Pmark(id);
		return "employee";
	}
}
