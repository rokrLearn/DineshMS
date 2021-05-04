package com.dinesh.app.controller; 

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dinesh.app.DestinationConfig;
import com.dinesh.app.model.Destination;
import com.dinesh.app.model.Traveller;
import com.dinesh.app.service.IDestinationService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RibbonClient(name = "destRibbon", configuration = DestinationConfig.class)
public class DestinationController {

	@Autowired
	IDestinationService destinationService;
	
	@Autowired 
	DiscoveryClient client;
	 
	@Autowired 
	RestTemplate template;
	
	@Autowired
	DestFeign destFeign;
	 
	@HystrixCommand(fallbackMethod = "getAllDestinationFallback")
	@GetMapping("/destinations")
	public List<Destination> getAllDestination(){
		System.out.println("In Main Method :: ");
		//List<ServiceInstance> travellerInstances = client.getInstances("travellerEurekaClient");
		//ServiceInstance travellerInstance = travellerInstances.get(0);
		//URI travellerUri = travellerInstance.getUri();
		
		//Traveller[] travellerArr = new RestTemplate().getForObject(travellerUri+"/travellers", Traveller[].class);
		//Traveller[] travellerArr = template.getForObject("http://destRibbon"+"/travellers", Traveller[].class);
		//Traveller[] travellerArr = template.getForObject("http://TRAVELLEREUREKACLIENT"+"/travellers", Traveller[].class);
		Traveller[] travellerArr = destFeign.getAllTraveller();
		List<Traveller> travellerLst = new ArrayList<>(Arrays.asList(travellerArr));
		travellerLst.forEach(t -> System.out.println(t));
		
		List<Destination> destinationLst = new ArrayList<>();
		destinationLst = destinationService.getAllDestination();
		return destinationLst;
	}
	
	public List<Destination> getAllDestinationFallback(){
		List<Destination> destinationLst = new ArrayList<>();
		System.out.println("here in fallback method :: ");
		return destinationLst;
	}
	@GetMapping("/destinations/{id}")
	public Destination getDestinationById(@PathVariable Long id) {
		
		Destination destination = new Destination();
		destination = destinationService.getDestinationById(id);
		return destination;
	}
}
