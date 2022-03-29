package com.ecom.api.repository;

import java.util.Iterator;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecom.api.entity.Cart;
import com.ecom.api.entity.Product;

public interface CartRepo extends JpaRepository<Cart, Integer> {

	
	List<Cart> findAll();
	
		
	//@Query(value = "")
	
}
