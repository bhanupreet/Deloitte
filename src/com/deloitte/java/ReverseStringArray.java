package com.deloitte.java;
public class ReverseStringArray {
	public static void main(String args[])
	{
		String[] s = {"Hello", "World", "Java"};
		for(int i = s.length-1; i >= 0; i--)
		{
			for (int j = s[i].length()-1; j >= 0;j--)
			System.out.print(s[i].charAt(j) + " ");
		System.out.print("\n");
		}
	}
}
