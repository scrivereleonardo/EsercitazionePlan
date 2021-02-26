package it.esercizio.esLeo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import it.esercizio.esLeo.*;


@RestController
public class BackEndDevController {
	List<BackEndDev> backEnd = new ArrayList<BackEndDev>(); 
	
	public BackEndDevController() {
		backEnd.add(new BackEndDev("Gabri", "Puli",14));
		backEnd.add(new BackEndDev("Leo", "Scri", 16));
		}
	
		
}
