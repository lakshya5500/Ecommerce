package com.ecommerce.service;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ecommerce.Entites.Product;
@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
