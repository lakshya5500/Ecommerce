package com.ecommerce.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entity.Category;

public interface ProductRepo extends JpaRepository<Category, Integer> {

	public List<Category> findBysubcat(String subcat);

	public List<Category> findBycat(String cat);

}
