package com.parksystem.model;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MotorcycleTest {

	@Test
	public void testObjectMotorcycle() {
		Motorcycle motorcycle = new Motorcycle();

		assertTrue(motorcycle instanceof Motorcycle);
		assertTrue(motorcycle instanceof Vehicle);

	}
}
