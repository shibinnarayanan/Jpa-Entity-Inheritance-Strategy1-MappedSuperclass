package com.svv.jpa.entity;

import javax.persistence.Entity;

@Entity
public class Tank extends Vehicle{
	
	private Integer firePower;

	public Tank() {
		super();
	}

	public Tank(String name, Integer seats, Integer firePower) {
		super(name, seats);
		this.firePower = firePower;
	}

	public Integer getFirePower() {
		return firePower;
	}

	public void setFirePower(Integer firePower) {
		this.firePower = firePower;
	}

}
