package com.FoodorderingSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Cart {
    @Id
	int billid;
    public int bill;
    
    @OneToOne
    Item item;
    
    
    @OneToOne
    Customer customer;


	public Cart(int billid, int bill, Item item, Customer customer) {
		super();
		this.billid = billid;
		this.bill = bill;
		this.item = item;
		this.customer = customer;
	}


	public int getBillid() {
		return billid;
	}


	public void setBillid(int billid) {
		this.billid = billid;
	}


	public int getBill() {
		return bill;
	}


	public void setBill(int bill) {
		this.bill = bill;
	}


	public Item getItem() {
		return item;
	}


	public void setItem(Item item) {
		this.item = item;
	}


	public Customer getcustomer() {
		return customer;
	}


	public void setcustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Cart [billid=" + billid + ", bill=" + bill + ", item=" + item + ", customer=" + customer + "]";
	}


	public Cart() {
	
	}
    
    
}
