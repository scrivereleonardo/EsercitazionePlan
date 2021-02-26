package it.esercizio.esLeo;

import javax.persistence.Entity;

public class FrontEndDev extends Employee {
	private int workedHours = 7;
	private int moneyForPromotion = 100;

	public FrontEndDev() {

	}

	public FrontEndDev(String name, String lastName, int id) {
		super(name, lastName, id, new TimeBank(id));

	}
	
	public double totalSalary() {
		double totalSal = (int) (this.gettBank().getBaseSalary() + ((this.gettBank().getPromotions()) * moneyForPromotion)
				+ ((this.gettBank().getOverTimeHours()) * (this.gettBank().getBaseSalary() / (30 * workedHours) * 1.7)));
		
		return totalSal;
		
	}

	public int getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

}
