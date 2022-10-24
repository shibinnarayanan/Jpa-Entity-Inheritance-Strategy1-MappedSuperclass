package com.svv.jpa.entity;

import javax.persistence.Entity;

@Entity
public class Truck extends Vehicle{
	
	private Integer maxLoad;
	private boolean sleeperCab;
	public Truck() {
		super();
	}
	public Truck(String name, Integer seats, Integer maxLoad, boolean sleeperCab) {
		super(name, seats);
		this.maxLoad = maxLoad;
		this.sleeperCab = sleeperCab;
	}
	@Override
	public String toString() {
		return "Truck [maxLoad=" + maxLoad + ", sleeperCab=" + sleeperCab + "]";
	}
	public Integer getMaxLoad() {
		return maxLoad;
	}
	public void setMaxLoad(Integer maxLoad) {
		this.maxLoad = maxLoad;
	}
	public boolean isSleeperCab() {
		return sleeperCab;
	}
	public void setSleeperCab(boolean sleeperCab) {
		this.sleeperCab = sleeperCab;
	}

}
