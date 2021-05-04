package com.dinesh.app.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dinesh.app.model.Traveller;

@FeignClient("TRAVELLEREUREKACLIENT")
public interface DestFeign {

	@RequestMapping(value="/travellers")
	Traveller[] getAllTraveller();
}
