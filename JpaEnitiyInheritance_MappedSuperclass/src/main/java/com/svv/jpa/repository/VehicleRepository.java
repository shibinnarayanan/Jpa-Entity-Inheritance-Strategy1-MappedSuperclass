package com.svv.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.svv.jpa.entity.Vehicle;

@NoRepositoryBean
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

}
