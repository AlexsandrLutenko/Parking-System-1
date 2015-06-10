package com.parksystem.model;


public class ParkingLot {
	
	private Level[] levels;
	private final int NUM_LEVELS = 5;
	
	public ParkingLot() {
		//TBD
	}
	
	
	/**
	 * Park the vehicle in a spot (or multiple spots). Return false if failed.
	 * 
	 * @param vehicle
	 * @return
	 */
	public boolean parkVehicle(Vehicle vehicle) {
		for (int i = 0; i < levels.length; i++) {
			if (levels[i].parkVehicle(vehicle)) {
				return true;
			}
		}
		return false;
	}
	
	public void print() {
		for (int i = 0; i < levels.length; i++) {
			System.out.print("Level" + i + ": ");
			levels[i].print();
			System.out.println("");
		}
		System.out.println("");
	}

}
