
package com.FoodorderingSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Customer {
    @Id
	String name;
	String address;
	long mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", mobile=" + mobile + "]";
	}
	public Customer(String name, String address, long mobile) {
		super();
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}
	public Customer() {
	
	}
	
	
}
