package com.BillGenerationSystems.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;



import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class Customer {
	
	public int cid;
	@Id
	public String name;
	public String hometown;
	public long phone;
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
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}

	
}
