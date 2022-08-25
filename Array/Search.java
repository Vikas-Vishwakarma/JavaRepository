package com.java.Arrays;

public class Search {
	public static void main(String[] args) {
		int[] arr = {5, 1, 1, 9, 7, 2, 6, 10};
		int key = 7;
		
//			for(int i=0;i<arr.length;i++) {
//				if(arr[i]==key) {
//					System.out.println(key+" Element is Present in Array");
//				}
//			}
		
		for(int i : arr) {
			if(i== key)
				System.out.println(key+" is present.");
		}
		
	}

}
