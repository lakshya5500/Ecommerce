package com.example.EAS.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.EAS.entity.Admin;


public interface AdminRepo extends JpaRepository<Admin, Integer>  {

	@Query(value = "SELECT * FROM `admin` WHERE employee_id= :id",nativeQuery = true)
	public Admin findByEmployee(@Param("id") int id);

}
