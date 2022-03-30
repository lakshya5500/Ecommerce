package com.FoodorderingSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="category")
public class Category {
    String cat;
    @Id
    String subcat;
    
    
    
    
	public Category() {
		
	
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public String getSubcat() {
		return subcat;
	}
	public void setSubcat(String subcat) {
		this.subcat = subcat;
	}
	@Override
	public String toString() {
		return "Category [cat=" + cat + ", subcat=" + subcat + "]";
	}
	public Category(String cat, String subcat) {
		super();
		this.cat = cat;
		this.subcat = subcat;
	}
    
    

}
