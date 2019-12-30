package com.deloitte.java;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number ");
		int i = s.nextInt();
		s.nextLine();
		System.out.print("Enter a string ");
		String str = s.nextLine();
		System.out.print(i + " " + str);
	}

}
