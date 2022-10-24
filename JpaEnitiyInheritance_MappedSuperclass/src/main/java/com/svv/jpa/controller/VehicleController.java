package com.svv.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.svv.jpa.entity.Tank;
import com.svv.jpa.entity.Truck;
import com.svv.jpa.repository.TruckRepository;


@RestController
public class VehicleController {
	
	@Autowired
	TruckRepository truckRepo;
	
	@PostMapping("/save/truck")
	ResponseEntity<Truck> createTruck(@RequestBody Truck truck)
	{
		System.out.println(truck);
		
		truck = truckRepo.save(truck);
		
		return new ResponseEntity<>(truck, HttpStatus.CREATED);
	}
	@PostMapping("/save/tank")
	ResponseEntity<Tank> createTruck(@RequestBody Tank tank)
	{
		System.out.println(tank);
		
		tank = truckRepo.save(tank);
		
		return new ResponseEntity<>(tank, HttpStatus.CREATED);
	}

}
