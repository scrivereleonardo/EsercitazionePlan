package it.esercizio.esLeo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Employee {
	private String name;
	private String lastName;
	
	
	@Id
	private int id;
	
	
	private TimeBank tBank;

	
	public Employee(String name, String lastName, int id) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.tBank = new TimeBank(this.id);
	}

	public Employee() {

	}

	// aggiungere metodo astratto per calcolo stipendio

	public abstract double totalSalary();

	public TimeBank gettBank() {
		return tBank;
	}

	public void settBank(TimeBank tBank) {
		this.tBank = tBank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
