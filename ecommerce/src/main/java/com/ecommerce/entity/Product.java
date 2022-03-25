package com.ecommerce.entity;

import javax.persistence.*;

@Embeddable
public class Product {

	String p_name;
	double p_price;

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

	public Product(String p_name, double p_price) {
		super();
		this.p_name = p_name;
		this.p_price = p_price;
	}

	@Override
	public String toString() {
		return "Product [p_name=" + p_name + ", p_price=" + p_price + "]";
	}

	public Product() {

	}

}
