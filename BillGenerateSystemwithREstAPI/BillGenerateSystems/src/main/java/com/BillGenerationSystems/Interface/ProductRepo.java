package com.BillGenerationSystems.Interface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BillGenerationSystems.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
