package com.FoodorderingSystem.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;




@Entity
public class Item {
    @Id
	int iid;
	String iname;
	String iprice;
	
	
	@OneToOne
	Category category;


	public Item() {
		
	}


	public int getIid() {
		return iid;
	}


	public void setIid(int iid) {
		this.iid = iid;
	}


	public String getIname() {
		return iname;
	}


	public void setIname(String iname) {
		this.iname = iname;
	}


	public String getIprice() {
		return iprice;
	}


	public void setIprice(String iprice) {
		this.iprice = iprice;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Item(int iid, String iname, String iprice, Category category) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.iprice = iprice;
		this.category = category;
	}


	@Override
	public String toString() {
		return "Item [iid=" + iid + ", iname=" + iname + ", iprice=" + iprice + ", category=" + category + "]";
	}


	


	
	


	
	}


