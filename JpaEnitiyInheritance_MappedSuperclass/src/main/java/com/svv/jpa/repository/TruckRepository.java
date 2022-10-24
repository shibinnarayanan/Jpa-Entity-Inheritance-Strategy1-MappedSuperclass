package com.svv.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.svv.jpa.entity.Truck;

@Repository
public interface TruckRepository extends VehicleRepository{

}
