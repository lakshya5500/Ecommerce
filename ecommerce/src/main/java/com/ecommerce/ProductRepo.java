package com.ecommerce;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepo extends JpaRepository<Product, Integer> {

	
	public List<Product> findBysubcat(String p_type);
	public List<Product> findBycat(String c_type);

	

}
