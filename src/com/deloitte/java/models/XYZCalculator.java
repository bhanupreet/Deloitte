package com.deloitte.java.models;

public class XYZCalculator implements Calculator {

	@Override
	public int sum(int x, int y) {
		return x - (-y);
	}

	@Override
	public int product(int x, int y) {
		return y * x;
	}
}