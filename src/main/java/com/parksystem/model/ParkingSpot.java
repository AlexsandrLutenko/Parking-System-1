package com.parksystem.model;

import com.parksystem.model.Vehicle;
import com.parksystem.model.VehicleSize;

public class ParkingSpot {

	private Vehicle vehicle;
	private VehicleSize spotSize;
	private int row;
	private int spotNumber;
	private Level level;

	public ParkingSpot(Level lvl, int r, int n, VehicleSize sz) {
		level = lvl;
		row = r;
		spotNumber = n;
		spotSize = sz;
	}

	/*
	 * In this method you have to check: 1. is this Spot available 2. can this
	 * vehicle fit in this spot
	 */
	public boolean canFitVehicle(Vehicle vehicle) {
		return isAvailable() && vehicle.canFitInSpot(this);
	}

	public boolean isAvailable() {
		return vehicle == null;
	}

	/* Park vehicle in this spot. */
	public boolean park(Vehicle v) {
		if (!canFitVehicle(v)) {
			return false;
		}
		vehicle = v;
		vehicle.parkInSpot(this);
		return true;
	}

	/*
	 * TBD: you have to implement removing vehicle from spot, and notify level
	 * that a new spot is available
	 */
	public void removeVehicle() {

	}

	public int getRow() {
		return row;
	}

	public int getSpotNumber() {
		return spotNumber;
	}

	public VehicleSize getSize() {
		return spotSize;
	}

	public void print() {
		if (vehicle == null) {
			if (spotSize == VehicleSize.Compact) {
				System.out.print("compact");
			} else if (spotSize == VehicleSize.Large) {
				System.out.print("large");
			} else if (spotSize == VehicleSize.Motorcycle) {
				System.out.print("motorcycle");
			}
		} else {
			vehicle.print();
		}
	}

}
