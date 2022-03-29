package com.CarRentalSystem.Entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

	@Id
	int cid;
	String name;
	String address;
	int mobile;
	
	@OneToOne
	Car car;
	@OneToOne
	Rental rent;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
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
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Rental getRent() {
		return rent;
	}
	public void setRent(Rental rent) {
		this.rent = rent;
	}
	
	
}
