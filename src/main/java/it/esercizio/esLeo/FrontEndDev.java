package it.esercizio.esLeo;

public class FrontEndDev extends Employee{
	private int workedHours=7;
	private int moneyForPromotion=100;
	
	public FrontEndDev() {
		
	}
	
	public FrontEndDev(String name, String lastName, int id, int workedHours, TimeBank tBank) {
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