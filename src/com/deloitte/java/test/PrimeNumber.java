package com.deloitte.java.test;

public class PrimeNumber {

	public boolean isPrime(int x) {
		boolean flag = false;
		if (x == 1 || x == 0 || x < 0) 
			flag = false;
		 else if (x % 2 == 0) 
			flag = false;
		 else if (x % 3 == 0) 
			flag = false;
		 else {
			for (int i = 5; i < x; i = i + 5) {
				if (x % i == 0)
					return flag;
				else
					flag = true;
			}
		}
		return flag;
	}
}
