package com.ecommerce;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepo extends JpaRepository<Product, Integer> {

	public List<Product> findByP_type(String p_type);
	public List<Product> findByC_type(String c_type);

	

}
