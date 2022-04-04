package com.example.EAS.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EAS.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
