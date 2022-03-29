package com.ecom.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cart {
	
	@Id
	int bill_id;	
	int bill;

	@OneToOne
	Product product;
	
	
	@OneToOne
	Customer customer;

	
	public Cart(int bill_id, int bill, Product product, Customer customer) {
		super();
		this.bill_id = bill_id;
		this.bill = bill;
		this.product = product;
		this.customer = customer;
	}


	@Override
	public String toString() {
		return " bill=" + bill + ", product=" + product + ", customer=" + customer + "]";
	}


	public int getBill_id() {
		return bill_id;
	}


	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}


	public int getBill() {
		return bill;
	}


	public void setBill(int bill) {
		this.bill = bill;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Cart() {
	
	}
	
	
	
}
