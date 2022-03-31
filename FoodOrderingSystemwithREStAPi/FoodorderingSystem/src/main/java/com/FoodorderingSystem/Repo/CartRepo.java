package com.FoodorderingSystem.Repo;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FoodorderingSystem.Entity.Cart;



@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {

 

  

	

	
}
