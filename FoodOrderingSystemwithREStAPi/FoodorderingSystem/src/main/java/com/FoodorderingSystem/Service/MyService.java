package com.FoodorderingSystem.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FoodorderingSystem.Entity.Cart;
import com.FoodorderingSystem.Entity.Category;
import com.FoodorderingSystem.Entity.Customer;
import com.FoodorderingSystem.Entity.Item;
import com.FoodorderingSystem.Repo.CartRepo;
import com.FoodorderingSystem.Repo.CategoryRepo;
import com.FoodorderingSystem.Repo.CustomerRepo;
import com.FoodorderingSystem.Repo.ItemRepo;


@Service
public class MyService {

	
	@Autowired
    public CartRepo cartRepo;
	
	@Autowired
    public ItemRepo itemRepo;	
	
	@Autowired
	public CustomerRepo customerRepo;

	@Autowired
	public CategoryRepo cateRepo;
	
	
	public Customer newcust(Customer c) {
		
		return customerRepo.save(c);
	}
	
	public List<Customer> AllCustomer(){
		return customerRepo.findAll();
	}

	
	public Item newitem(Item i) {
		return itemRepo.save(i);
		
	}
	public List<Item> AllItem() {
		return itemRepo.findAll(); 
	}
	
	public Category newcat(Category ca) {
		return cateRepo.save(ca);
		}

	public List<Category> AllCategory() {
		return cateRepo.findAll();
	}
   
	public List<Item> getveg() {		
		return itemRepo.findByveg();
	}
	public List<Item> getnonveg() {		
		return itemRepo.findBynonveg();
	}
	public List<Item> getsouthindian() {		
		return itemRepo.findBysouthindian();
	}
	
	public Item getname(String iname) {
		return itemRepo.findByIname(iname);
	}

	public Cart bentry(Cart cart) {
		
		return cartRepo.save(cart);
	}
	
	public List<Cart> Allbill(){
		return cartRepo.findAll();
	}
	 
	
	
    
}

