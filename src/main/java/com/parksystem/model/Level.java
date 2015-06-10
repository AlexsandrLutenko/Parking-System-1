package com.parksystem.model;

import com.parksystem.model.ParkingSpot;
import com.parksystem.model.Vehicle;
import com.parksystem.model.VehicleSize;

public class Level {

	private int floor;
	private ParkingSpot[] spots;
	private int availableSpots = 0; // number of free spots in on the level
	private static final int SPOTS_PER_ROW = 10;

	public Level(int flr, int numberSpots) {

		// TBD
	}

	/**
	 * @return available spots in the level
	 */
	public int availableSpots() {
		return availableSpots;
	}

	/**
	 * Try to find a place to park this vehicle. Return false if failed.
	 * 
	 * @param vehicle
	 * @return
	 */
	public boolean parkVehicle(Vehicle vehicle) {
		// TBD
		return false;
	}

	/**
	 * 
	 * Park a vehicle starting at the spot spotNumber, and continuing until
	 * vehicle.spotsNeeded.
	 * 
	 * @param spotNumber
	 * @param vehicle
	 * @return
	 */
	private boolean parkStartingAtSpot(int spotNumber, Vehicle vehicle) {
		// TBD
		return false;
	}

	/**
	 * find a spot to park this vehicle. Return index of spot, or -1 on failure.
	 * 
	 * @param vehicle
	 * @return
	 */
	private int findAvailableSpots(Vehicle vehicle) {
		// TBD
		return -1;
	}

	public void print() {
		// TBD
	}

	/**
	 * 
	 * When a car was removed from the spot, increment availableSpots Level
	 * notification
	 * 
	 */
	public void spotFreed() {
		availableSpots++;
	}

}
