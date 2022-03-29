package com.CarRentalSystem.Entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rental {

	@OneToOne
	Car regno;
	@Id
	int fee;
	String due;

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getDue() {
		return due;
	}

	public void setDue(String due) {
		this.due = due;
	}

	public Car getRegno() {
		return regno;
	}

//	public void setRegno(Car regno) {
//		this.regno = regno;
//	}

}
