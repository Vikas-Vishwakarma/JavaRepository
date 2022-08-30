package com.java.recursion;

import java.util.Scanner;

public class IncrementalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();
		
		printNumber(1,n);
		
	}
	public static void printNumber(int start, int end) {
		//Base Condition
		if(start == end + 1) {
			return;
		}
		
		System.out.print(start+" ");
		printNumber(start+1, end);
	}
}
