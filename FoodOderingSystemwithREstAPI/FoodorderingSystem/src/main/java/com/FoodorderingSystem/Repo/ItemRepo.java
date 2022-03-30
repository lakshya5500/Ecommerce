package com.FoodorderingSystem.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.FoodorderingSystem.Entity.Item;


@Repository
public interface ItemRepo extends  JpaRepository<Item, Integer> {

	@Query(value = "SELECT * FROM `item` WHERE category_subcat ='veg'",nativeQuery = true)
	public List<Item> findByveg();
	@Query(value = "SELECT * FROM `item` WHERE category_subcat ='nonveg'",nativeQuery = true)
	public List<Item> findBynonveg();
	@Query(value = "SELECT * FROM `item` WHERE category_subcat ='southindian'",nativeQuery = true)
	public List<Item> findBysouthindian();
	
	public Item findByIname(String iname);

}
