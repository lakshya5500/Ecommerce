package com.FoodorderingSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FoodorderingSystem.Entity.Cart;
import com.FoodorderingSystem.Entity.Category;
import com.FoodorderingSystem.Entity.Customer;
import com.FoodorderingSystem.Entity.Item;
import com.FoodorderingSystem.Service.MyService;


@RestController
public class MyController {

	@Autowired
	MyService myservice;
	
	
	
@GetMapping("/")
public String Home() {
	return "home";
}
@PostMapping("/customer")
 public Customer cust(@RequestBody Customer c) {
	 return myservice.newcust(c);
 }
@GetMapping("/customer")
public List<Customer> Allcust() {
	return myservice.AllCustomer();
}
@GetMapping("/item")
public List<Item>Allitem(){
	return myservice.AllItem();
}

@PostMapping("/item")
public Item item(@RequestBody Item i) {
	return myservice.newitem(i);
}
@GetMapping("/cat")
public List<Category>Allcat(){
	return myservice.AllCategory();
}
@PostMapping("/cat")
public Category cat(@RequestBody Category ca) {
	return myservice.newcat(ca);
}
@GetMapping("/veg")
public List<Item> findveg(){
	return myservice.getveg();
}
@GetMapping("/nonveg")
public List<Item> findnonveg(){
	return myservice.getnonveg();
}
@GetMapping("/southindian")
public List<Item> findsouthindian(){
	return myservice.getsouthindian();
}
@GetMapping("/name/{iname}")
public Item findname(@PathVariable String iname) {
	return myservice.getname(iname);
}

@PostMapping("/bill")
public Cart Billentry(@RequestBody Cart cart) {
	return myservice.bentry(cart);
}

@GetMapping("/allbill")
public List<Cart> AllBill(){
	return myservice.Allbill();
}

}
