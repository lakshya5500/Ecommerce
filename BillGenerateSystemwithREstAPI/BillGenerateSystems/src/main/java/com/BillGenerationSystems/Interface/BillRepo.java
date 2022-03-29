package com.BillGenerationSystems.Interface;

import org.springframework.data.jpa.repository.JpaRepository;


import com.BillGenerationSystems.Entity.Bill;

public interface BillRepo extends JpaRepository<Bill, Integer> {


}
