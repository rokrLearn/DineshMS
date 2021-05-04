package com.dinesh.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinesh.app.model.Destination;
import com.dinesh.app.repository.IDestinationRepository;
import com.dinesh.app.service.IDestinationService;

@Service
public class DestinationServiceImpl implements IDestinationService{

	@Autowired
	IDestinationRepository destinationRepository;
	
	@Override
	public List<Destination> getAllDestination() {
		return destinationRepository.findAll();
	}

	@Override
	public Destination getDestinationById(Long id) {
		return destinationRepository.findById(id).get();
	}

	
}
