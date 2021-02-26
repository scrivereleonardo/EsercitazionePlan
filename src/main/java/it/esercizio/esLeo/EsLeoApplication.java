package it.esercizio.esLeo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EsLeoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsLeoApplication.class, args);
	
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new BackEndDev("Gabriele", "Puliti", 1 ));
		employees.add(new Devops ("Stefano", "Verdi", 2));
		employees.add(new Devops ("Giulia", "Rossi", 3));
	
		employees.get(1).gettBank().addOvertimeHours(120);
		employees.get(2).gettBank().promote();
		employees.get(0).gettBank().promote();
		
		for (Employee employee : employees) {
			System.out.println(employee.totalSalary());
			printAll(employee, employee.gettBank());
			
		}
		
	}

	private static void printAll(Employee employee, TimeBank timeBank) {
		System.out.println("Dipendente: " + employee.getName() + employee.getLastName());
		
		
	}

}
