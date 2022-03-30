package com.FoodorderingSystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FoodorderingSystem.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, String> {

	
}
