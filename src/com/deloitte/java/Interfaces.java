package com.deloitte.java;

import com.deloitte.java.models.ABCCalculator;
import com.deloitte.java.models.Calculator;
import com.deloitte.java.models.XYZCalculator;

public class Interfaces {
	public static void main(String args[]) {
		Calculator c = new ABCCalculator();
		System.out.println(c.sum(12, 13));
		System.out.println(c.product(4, 7));

		Calculator d = new XYZCalculator();

		System.out.println(d.sum(4, 9));
		System.out.println(d.product(3, 7));
	}
}
