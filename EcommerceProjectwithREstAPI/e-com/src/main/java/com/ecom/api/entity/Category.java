package com.ecom.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	
    @Id
	String subcat;
	String cat;
	
	
	
	public String getSubcat() {
		return subcat;
	}
	public void setSubcat(String subcat) {
		this.subcat = subcat;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "Category [subcat=" + subcat + ", cat=" + cat + "]";
	}
	public Category(String subcat, String cat) {
		super();
		this.subcat = subcat;
		this.cat = cat;
	}
	public Category() {
	
	}
	
	
	
}
