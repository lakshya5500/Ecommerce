package com.FoodorderingSystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FoodorderingSystem.Entity.Category;



public interface CategoryRepo extends JpaRepository<Category, String>{

	

}
