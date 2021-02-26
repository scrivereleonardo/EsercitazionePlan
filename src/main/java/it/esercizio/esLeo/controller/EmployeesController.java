package it.esercizio.esLeo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import it.esercizio.esLeo.*;

@RestController
public class EmployeesController {
	List<Employee> emp = new ArrayList<Employee>();

	public EmployeesController() {
		emp.add(new BackEndDev("Gabri", "Puli", 1));
		emp.add(new Devops("Leo", "Scri", 0));

	}

	@GetMapping("/employees/backend")
	public List<Employee> getBackEndEmployees() {
		List<Employee> app = new ArrayList<Employee>();
		for (Employee indexBackEnd : emp) {
			if (indexBackEnd instanceof BackEndDev) {
				app.add(indexBackEnd);
			}

		}
		return app;
	}

	@GetMapping("/employees/frontend")
	public List<Employee> getFrontEndEmployees() {
		List<Employee> app = new ArrayList<Employee>();
		for (Employee indexFrontEnd : emp) {
			if (indexFrontEnd instanceof FrontEndDev) {
				app.add(indexFrontEnd);
			}

		}
		return app;
	}

	@GetMapping("/employees/devops")
	public List<Employee> GetDevopsEmployees() {
		List<Employee> app = new ArrayList<Employee>();
		for (Employee indexDevops : emp) {
			if (indexDevops instanceof Devops) {
				app.add(indexDevops);
			}

		}
		return app;
	}

	@GetMapping("/employees/fullstack")
	public List<Employee> getFullStackEmployees() {
		List<Employee> app = new ArrayList<Employee>();
		for (Employee indexFullStack : emp) {
			if (indexFullStack instanceof FullStackDev) {
				app.add(indexFullStack);
			}

		}
		return app;
	}

	@GetMapping("/employees/sysEngineer")
	public List<Employee> getSysEngineerEmployees() {
		List<Employee> app = new ArrayList<Employee>();
		for (Employee indexEngineer : emp) {
			if (indexEngineer instanceof SysEngineer) {
				app.add(indexEngineer);
			}

		}
		return app;
	}

	@GetMapping("/employees/{id}")
	public Employee getSingleEmployee(@PathVariable("id") int id) {

		for (Employee employee : emp) {
			if (employee.getId() == id) {
				return employee;

			}

		}
		return null;

	}

	@PostMapping("/employees/backend")
	public void addBackEnd(@RequestBody BackEndDev cw) {
		cw.settBank(new TimeBank(cw.getId()));
		emp.add(cw);

	}

	@PostMapping("/employees/frontEnd")
	public void addFrontEnd(@RequestBody FrontEndDev cw) {
		cw.settBank(new TimeBank(cw.getId()));
		emp.add(cw);

	}

	@PostMapping("/employees/devops")
	public void addDevops(@RequestBody Devops cw) {
		cw.settBank(new TimeBank(cw.getId()));
		emp.add(cw);

	}

	@PostMapping("/employees/sysEngineer")
	public void addEngineer(@RequestBody Devops cw) {
		cw.settBank(new TimeBank(cw.getId()));
		emp.add(cw);

	}

	@PostMapping("/employees/fullStack")
	public void addFullstack(@RequestBody Devops cw) {
		cw.settBank(new TimeBank(cw.getId()));
		emp.add(cw);

	}

	@PatchMapping("/employees/{id}")
	public void updatePerson(@PathVariable("id") int id, @RequestBody Employee cw) {

		for (Employee employee : emp) {

			if (employee.getId() == id) {
				Employee currentPerson = employee;
				currentPerson.setName(cw.getName());
				currentPerson.setLastName(cw.getLastName());

			}
		}
	}

	@GetMapping("/employees/promotion/{id}")
	public void promoteEmployee(@PathVariable("id") int id) {

		for (Employee employee : emp) {
			if (employee.getId() == id) {
				employee.gettBank().promote();

			}

		}

	}
/*	
	@GetMapping("/employees/promotion/{id}")
	public void promoteEmployee1(@PathVariable("id") int id) {

		for (Employee employee : emp) {
			if (employee.getId() == id) {
				employee.gettBank().wo();

			}

		}

	}*/

}
