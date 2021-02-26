package it.esercizio.esLeo;

public class Devops extends Employee {
	private int workedHours=9;
	private int moneyForPromotion=250;

	public Devops() {
		
	}
	
	public Devops(String name, String lastName, int id, int workedHours, TimeBank tBank) {
		super(name, lastName, id, tBank);
	
	
	
	}
	
	public double totalSalary() {
		double totalSal = this.gettBank().getBaseSalary()+((this.gettBank().getPromotions())*moneyForPromotion)+((this.gettBank().getOverTimeHours())*(this.gettBank().getBaseSalary()/(30*workedHours)*1.7));
		return totalSal;

	}
	public int getWorkedHours() {
		return workedHours;
	}
	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

}
