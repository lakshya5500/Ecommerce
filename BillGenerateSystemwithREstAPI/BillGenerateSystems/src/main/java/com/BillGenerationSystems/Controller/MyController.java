package com.BillGenerationSystems.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BillGenerationSystems.Entity.Bill;
import com.BillGenerationSystems.Entity.Customer;
import com.BillGenerationSystems.Entity.Product;
import com.BillGenerationSystems.Interface.BillRepo;
import com.BillGenerationSystems.Interface.CustomerRepo;
import com.BillGenerationSystems.Interface.ProductRepo;



@RestController
public class MyController {

	
	@Autowired
	CustomerRepo repo;
	
	@Autowired
	ProductRepo repo2;
	
	@Autowired 
	BillRepo repo3;
	
	@GetMapping("/")
	public String home() {
		return "hello";
	}
	
	@GetMapping("/customer")
	public List<Customer> getCustomer(){
		return repo.findAll();
	}
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer){
		repo.save(customer);
		return customer;
	}
    
	@DeleteMapping("/delete")
	public Customer deleteCustomer(@RequestBody Customer customer){
		 repo.delete(customer);
		return customer;
	}
	
	@GetMapping("/product")
	public List<Product> getProduct(){
		return repo2.findAll();
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product){
		repo2.save(product);
		return product;
	}
	
	@GetMapping("/bill")
	public List<Bill> getBill(){
		return repo3.findAll();
	}
	
	@PostMapping("/bills")
	public Bill addBill(@RequestBody Bill bill){
		repo3.save(bill);
		return bill;
	}
}
