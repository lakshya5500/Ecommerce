package com.BillGenerationSystems.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Bill {
	@Id
	public int billid;
    public int price;
    
  
    @ManyToOne
   Product pname;
    @ManyToOne
    Customer name;
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product getPname() {
		return pname;
	}
	public void setPname(Product pname) {
		this.pname = pname;
	}
	public Customer getName() {
		return name;
	}
	public void setName(Customer name) {
		this.name = name;
	}
   
    
}
