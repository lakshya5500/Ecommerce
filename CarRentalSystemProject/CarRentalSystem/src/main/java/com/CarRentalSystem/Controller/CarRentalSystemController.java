package com.CarRentalSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CarRentalSystem.Entites.Car;
import com.CarRentalSystem.Entites.Customer;
import com.CarRentalSystem.Entites.Rental;
import com.CarRentalSystem.Interface.CarRepo;
import com.CarRentalSystem.Interface.CustomerRepo;
import com.CarRentalSystem.Interface.Rentalrepo;

@RestController
public class CarRentalSystemController {

	@Autowired
	CarRepo carRepo;
	@Autowired
	CustomerRepo customerRepo;
	@Autowired
	Rentalrepo rentalRepo;

	@GetMapping({ "/", "/home" })
	public String home() {
		return "Hii Welcome to Our Car-Rent Service";
	}

	@GetMapping("/car")
	public List<Car> getAllCars() {
		return carRepo.findAll();
	}

	@GetMapping("/customer")
	public List<Customer> getAllCustomers() {
		return customerRepo.findAll();
	}

	@GetMapping("/rent")
	public List<Rental> getAllrents() {
		return rentalRepo.findAll();
	}

	@PostMapping("/car")
	public Car addCars(@RequestBody Car car) {
		carRepo.save(car);
		return car;
	}

	@DeleteMapping("/delete")
	public Car deleteCars(@RequestBody Car car) {
		carRepo.delete(car);
		return car;
	}

//	For Query Structure 

	@GetMapping("/name")
	public List<Car> findAllCarsByName() {
		return carRepo.findBymodelname();
	}

	@GetMapping("/daksh")
	public List<Customer> getAllCustomerss() {
		return customerRepo.findByAll();

	}

}
