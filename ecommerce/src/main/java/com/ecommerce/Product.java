package com.ecommerce;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	int p_code;
	String p_name;
	double p_price;
	String subcat;
	String cat;
	public Product() {
	}
	public Product(int p_code, String p_name, double p_price, String p_type, String c_type) {
		super();
		this.p_code = p_code;
		this.p_name = p_name;
		this.p_price = p_price;
		this.subcat = p_type;
		this.cat = c_type;
	}
	public int getP_code() {
		return p_code;
	}
	public void setP_code(int p_code) {
		this.p_code = p_code;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public double getP_price() {
		return p_price;
	}
	public void setP_price(double p_price) {
		this.p_price = p_price;
	}
	public String getP_type() {
		return subcat;
	}
	public void setP_type(String p_type) {
		this.subcat = p_type;
	}
	public String getC_type() {
		return cat;
	}
	public void setC_type(String c_type) {
		this.cat = c_type;
	}
	@Override
	public String toString() {
		return "Product [p_code=" + p_code + ", p_name=" + p_name + ", p_price=" + p_price + ", p_type=" + subcat
				+ ", c_type=" + cat + "]";
	}
	
	
}
