package com.CarRentalSystem.Interface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CarRentalSystem.Entites.Rental;

public interface Rentalrepo extends JpaRepository<Rental, Integer>{

}
