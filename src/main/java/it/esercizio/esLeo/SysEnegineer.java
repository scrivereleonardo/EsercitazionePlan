package it.esercizio.esLeo;

public class SysEnegineer extends Employee {
	private int workedHours = 6;
	private int moneyForPromotion = 150;

	public SysEnegineer() {

	}

	public SysEnegineer(String name, String lastName, int id,  TimeBank tBank) {
		super(name, lastName, id, tBank);

	}

	public double totalSalary() {
		double totalSal = this.gettBank().getBaseSalary() + ((this.gettBank().getPromotions()) * moneyForPromotion)
				+ ((this.gettBank().getOverTimeHours()) * (this.gettBank().getBaseSalary() / (30 * workedHours) * 1.7));
		return totalSal;

	}

	public int getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

}
