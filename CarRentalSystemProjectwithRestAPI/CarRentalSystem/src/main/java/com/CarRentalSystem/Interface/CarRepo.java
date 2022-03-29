package com.CarRentalSystem.Interface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.CarRentalSystem.Entites.Car;


public interface CarRepo extends JpaRepository<Car, Integer>{

	@Query(value = "SELECT * FROM car ", nativeQuery = true)
	public List<Car> findBymodelname();

}
