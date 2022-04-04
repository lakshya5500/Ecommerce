package com.example.EAS.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Admin {
	@Id
	int aid;
	int workingday;
	int halfday;
	int Absents;
	@OneToOne
	Employee employee;
	
	
	
	public Admin(int aid, int halfday, int workingday, int absents, Employee employee) {
		super();
		this.aid = aid;
		this.halfday = halfday;
		this.workingday = workingday;
		Absents = absents;
		this.employee = employee;
	}



	@Override
	public String toString() {
		return " " + aid + " " + halfday + " " + workingday + " " + Absents
				+ " " + employee + " ";
	}



	public int getAid() {
		return aid;
	}



	public void setAid(int aid) {
		this.aid = aid;
	}



	public int getHalfday() {
		return halfday;
	}



	public void setHalfday(int halfday) {
		this.halfday = halfday;
	}



	public int getWorkingday() {
		return workingday;
	}



	public void setWorkingday(int workingday) {
		this.workingday = workingday;
	}



	public int getAbsents() {
		return Absents;
	}



	public void setAbsents(int absents) {
		Absents = absents;
	}



	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	public Admin() {
	
	}
	
	
}
