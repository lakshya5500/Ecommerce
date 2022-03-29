package com.CarRentalSystem.Interface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.CarRentalSystem.Entites.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	@Query(value = "SELECT * FROM customer ", nativeQuery = true)
	public List<Customer> findByAll();
}
