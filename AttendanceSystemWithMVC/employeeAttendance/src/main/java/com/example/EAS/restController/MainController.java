package com.example.EAS.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EAS.entity.Admin;
import com.example.EAS.entity.Employee;
import com.example.EAS.service.MainService;

@RestController
public class MainController {

	@Autowired
	MainService mainService;
	
	@PostMapping("/addemp")
	public Employee AddEmp(@RequestBody Employee emp) {
		return mainService.NewEmp(emp);
	}
	@GetMapping("/allemp")
	public List<Employee> getAllEmp(){
		return mainService.AllEmp();
	}
	@GetMapping("/all/{aid}")
	public Optional<Admin> getAllEmp(@PathVariable int aid){
		return mainService.find(aid);
	}
	
	@PostMapping("/present/{id}")
	public String Present(@PathVariable int id) {
		
		mainService.Pmark(id);
		return "present Marked";
	}
}
