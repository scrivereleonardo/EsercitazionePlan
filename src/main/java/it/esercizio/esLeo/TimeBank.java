package it.esercizio.esLeo;

public class TimeBank {
	private int baseSalary=1000;
	private int promotions=0;
	private int overTimeHours=0;	
	
	
	public TimeBank() {

	}
	
	public TimeBank(int baseSalary, int promotions, int overTimeHours) {
		super();
		this.baseSalary = baseSalary;
		this.promotions = promotions;
		this.overTimeHours = overTimeHours;
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
	public void addOvertimeHour() {
		this.overTimeHours += 1;
	}
	
	
}
