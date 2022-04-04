package com.example.EAS.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	int id;	
	String name;
	String departmant;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartmant() {
		return departmant;
	}
	public void setDepartmant(String departmant) {
		this.departmant = departmant;
	}
	@Override
	public String toString() {
		return "  " + name + " , " + departmant + "  ";
	}
	public Employee(int id, String name, String departmant) {
		super();
		this.id = id;
		this.name = name;
		this.departmant = departmant;
	}
	public Employee() {
		
	}
	
	
}
