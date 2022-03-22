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
	String p_type;
	String c_type;
	public Product() {
	}
	public Product(int p_code, String p_name, double p_price, String p_type, String c_type) {
		super();
		this.p_code = p_code;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_type = p_type;
		this.c_type = c_type;
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
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public String getC_type() {
		return c_type;
	}
	public void setC_type(String c_type) {
		this.c_type = c_type;
	}
	@Override
	public String toString() {
		return "Product [p_code=" + p_code + ", p_name=" + p_name + ", p_price=" + p_price + ", p_type=" + p_type
				+ ", c_type=" + c_type + "]";
	}
	
	
}
