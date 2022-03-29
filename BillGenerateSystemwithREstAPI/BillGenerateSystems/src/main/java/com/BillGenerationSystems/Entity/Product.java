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

public class Product {
	@Id
	public int pid;
	public String pname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	
	
}
