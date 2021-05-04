package com.dinesh.app.service;

import java.util.List;


import com.dinesh.app.model.Traveller;

public interface ITravellerService {

	public List<Traveller> getAllTraveller();
	public Traveller getTravellerById(Long id);
}
