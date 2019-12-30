package com.deloitte.java;
public class ReverseStringCountVowel {
	public static void main(String Args[]){
		int count = 0;
		String demo = "demo string iou";
		char arr[] = demo.toCharArray();
		 for(int i = demo.length()-1; i >= 0; i--){
		 if(arr[i]=='a' ||
			arr[i]=='e' ||
			arr[i]=='i' ||
			arr[i]=='o' ||
			arr[i]=='u'){
				count++;
			}
			System.out.print(arr[i]);
		}
		System.out.println("\nvowels = " + count);
	}
}
