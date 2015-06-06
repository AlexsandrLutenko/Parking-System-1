package com.parksystem.model;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class CarTest {
	
	@Test	
	public void testObjectCar() {
		Car car = new Car(); 
		
		assertTrue(car instanceof Car);
		assertTrue(car instanceof Vehicle);
 
	}
	
	
}
