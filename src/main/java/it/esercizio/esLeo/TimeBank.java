package it.esercizio.esLeo;

import java.util.HashMap;
import java.util.Map;





public class TimeBank {
	private int baseSalary = 1000;
	private int promotions = 0;
	private int overTimeHours = 0;
	
	

	


	public TimeBank(int id) {
		
	}



	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getPromotions() {
		return promotions;
	}

	public void setPromotions(int promotions) {
		this.promotions = promotions;
	}

	public int getOverTimeHours() {
		return overTimeHours;
	}

	public void setOverTimeHours(int overTimeHours) {
		this.overTimeHours = overTimeHours;
	}

	
	public void promote() {
		this.promotions += 1;
	}

	public void addOvertimeHours (int hours) {
		this.overTimeHours += hours;
	}
	
	public void addToSalary(Employee employee, Integer salary) {
		
		
	}
	

}
