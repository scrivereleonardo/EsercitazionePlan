package it.esercizio.esLeo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EsLeoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsLeoApplication.class, args);
	
		TimeBank timeBank = new TimeBank();
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Devops("Gabriele", "Puliti", 1 , timeBank));
		employees.add(new Devops ("Stefano", "Verdi", 2, timeBank));
		employees.add(new Devops ("Giulia", "Rossi", 3, timeBank));
	
		
		
		
		for (Employee employee : employees) {
			printAll(employee, timeBank);
		}
		
	}

	private static void printAll(Employee employee, TimeBank timeBank) {
		System.out.println("Dipendente: " + employee.getName() + employee.getLastName());
		System.out.println("Ore lavorate: " + employee.totalSalary());
		
	}

}
