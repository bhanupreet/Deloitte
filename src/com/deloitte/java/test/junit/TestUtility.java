package com.deloitte.java.test.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.deloitte.java.test.Utility;

public class TestUtility {

	Utility u = null;

	@Before
	public void setup() {
		u = new Utility();
	}

	@Test
	public void testSqr() {
		assertEquals(100,u.sqr(10));	
	}
	
	@Test
	public void testSum() {
		assertEquals(10,u.sum(5, 5));
	}
	
	@Test
	public void testPower() {
		assertEquals(8,u.power(2, 3));
	}
	
	@After
	public void tearDown() {
		u = null;
	}

}
