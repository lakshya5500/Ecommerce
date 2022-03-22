package com.ecommerce.service;

import java.util.List;


import com.ecommerce.Entites.Product;

public interface ProductRepo {

	public List<Product> findAll();
	public List<Product> findByType(String p_type);
	public List<Product> findByCategory(String c_type);

}
