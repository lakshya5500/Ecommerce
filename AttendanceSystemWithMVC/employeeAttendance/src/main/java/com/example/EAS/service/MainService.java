package com.example.EAS.service;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.EAS.entity.Admin;
import com.example.EAS.entity.Employee;
import com.example.EAS.repositry.AdminRepo;
import com.example.EAS.repositry.EmployeeRepo;


@Service
public class MainService {

	@Autowired
	AdminRepo adminRepo;
	@Autowired
	EmployeeRepo employeeRepo;
	
	public Employee NewEmp(Employee emp) {
		return employeeRepo.save(emp);
	}
	public Optional<Employee> findemp(int id) {
		return employeeRepo.findById(id);
	}
	public List<Employee> AllEmp(){
		return employeeRepo.findAll();
	}
	public void Pmark(int id) {
		Admin ad=new Admin();
		ad=adminRepo.findByEmployee(id);
		
		Calendar c = Calendar.getInstance();
		int monthMaxDays = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		if(ad.getWorkingday()==monthMaxDays) {
			ad.setWorkingday(0);
		}
		int hour=c.get(Calendar.HOUR_OF_DAY);		
		int min=c.get(Calendar.MINUTE);		
		System.out.println(hour);
		int w=ad.getWorkingday()+ad.getAbsents()+ad.getHalfday();
		int day=c.get(Calendar.DATE);
		
		if(w!=day) {
			
		if(hour<=10) {
			if(min<=10) {
		ad.setWorkingday(ad.getWorkingday()+1);
		adminRepo.save(ad);
			}		
		}
		else if(hour<=13) {
			if(min<=30) {
		ad.setHalfday(ad.getHalfday()+1);
		adminRepo.save(ad);
			} 
		}
		else {
			ad.setAbsents(ad.getAbsents()+1);
			adminRepo.save(ad);
		}
		
		System.out.println(ad);
		}
		
	}
	public Optional<Admin> find(int aid) {
		
		return adminRepo.findById(aid);
	}
	public List<Admin> AllDetails() {
		List<Admin> ad=adminRepo.findAll();
		int t=Calendar.HOUR_OF_DAY;
		if(14<=t) {
		Iterator<Admin> it=ad.iterator();
		while(it.hasNext()) {
			Admin a=new Admin();
			a=it.next();
			int tday=a.getAbsents()+a.getHalfday()+a.getWorkingday();
			if(tday!=Calendar.DATE) {
				
				a.setAbsents(a.getAbsents()+(Calendar.DATE-tday));
				adminRepo.save(a);
			}
		}
		}
		return ad;
	}
	
	
	
}
