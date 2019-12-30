package com.deloitte.java.test.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.deloitte.java.test.PrimeNumber;

public class TestPrimeNumber {

	PrimeNumber p = new PrimeNumber();
	@Test
	public void test() {
		assertEquals(false,p.isPrime(22));
		assertEquals(false,p.isPrime(0));
		assertEquals(false,p.isPrime(1));
		assertEquals(true,p.isPrime(7));
		assertTrue(true==p.isPrime(17));
	}

}
