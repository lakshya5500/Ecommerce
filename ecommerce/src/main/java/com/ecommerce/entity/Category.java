package com.ecommerce.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	String cat;
	@Id
	String subcat;

	@ElementCollection

	private List<Product> category = new ArrayList<Product>();

	public Category() {

	}

	public Category(String cat, String subcat, List<Product> category) {
		super();
		this.cat = cat;
		this.subcat = subcat;
		this.category = category;
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

	public List<Product> getCategory() {
		return category;
	}

	public void setCategory(List<Product> category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Category [cat=" + cat + ", subcat=" + subcat + ", category=" + category + "]";
	}

}
