package com.dinesh.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.app.model.Traveller;
import com.dinesh.app.service.ITravellerService;

@RestController
public class TravellerController {
	
	@Autowired
	ITravellerService travellerService;

	@GetMapping("/travellers")
	public List<Traveller> getAllTraveller() {
		int i = 10;
		if(i == 10)
			throw new RuntimeException();
		List<Traveller> travellerLst = new ArrayList<>();
		System.out.println("===Fetching Data===");
		travellerLst = travellerService.getAllTraveller();
		return travellerLst;
	}
	
	@GetMapping("/travellers/{id}")
	public Traveller getTravellerById(@PathVariable Long id) {
		Traveller traveller = new Traveller();
		System.out.println("===Fetching Data===");
		traveller = travellerService.getTravellerById(id);
		return traveller;
	}
}
