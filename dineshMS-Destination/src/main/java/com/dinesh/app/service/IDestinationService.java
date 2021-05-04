package com.dinesh.app.service;

import java.util.List;

import com.dinesh.app.model.Destination;

public interface IDestinationService {

	public List<Destination> getAllDestination();
	public Destination getDestinationById(Long id);
}
