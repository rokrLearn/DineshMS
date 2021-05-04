package com.dinesh.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinesh.app.model.Traveller;
import com.dinesh.app.repository.ITravellerRepository;
import com.dinesh.app.service.ITravellerService;

@Service
public class TravellerServiceImpl implements ITravellerService{

	@Autowired
	ITravellerRepository travellerRepository;
	
	@Override
	public List<Traveller> getAllTraveller() {
		return travellerRepository.findAll();
	}

	@Override
	public Traveller getTravellerById(Long id) {
		return travellerRepository.findById(id).get();
	}

}
