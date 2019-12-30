package com.deloitte.java;
import java.util.StringTokenizer;

public class StringFunctions {

	public static void main(String args[]) {
		String s = " something, just, like, this";
		String[] s1 = s.split(",");
		StringTokenizer st = new StringTokenizer(s,",");
		for (String s2 : s1) {
//			System.out.println(s2);
			}
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
