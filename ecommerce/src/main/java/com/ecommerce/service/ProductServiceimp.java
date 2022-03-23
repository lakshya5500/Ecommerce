package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ecommerce.entity.Category;

@Service
public class ProductServiceimp {

	@Autowired
	private ProductRepo productRepo;

	public List<Category> getAllProduct(String subcat) {
		List<Category> product = new ArrayList<Category>();
		productRepo.findBysubcat(subcat).forEach(Category -> product.add(Category));
		return product;
	}
}
