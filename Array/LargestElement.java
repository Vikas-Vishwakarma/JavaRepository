package com.java.Arrays;

public class LargestElement {
	public static void main(String[] args) {
		int[] arr = {5, 1, 1, 9, 7, 2, 6, 10};
		int temp = 0;
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//			if(temp < arr[i]) {
//				temp = arr[i];
//			}
//		}
//		System.out.println(temp);
//		}
//		
		
		
		for(int element : arr) {
			if(temp < element) {
				temp = element;
			}
		}
		System.out.println(temp);
	}

}
