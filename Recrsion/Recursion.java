package com.java.recursion;

import java.util.Scanner;

//Write a java program to print 5, 4,3,2,1 i.e; n-1

public class Recursion {
	public static void printNumber(int n) {
		if(n == 0) {
			return;
		}
		System.out.print(n+ " ");
		printNumber(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();
		
		printNumber(n);
	}
	
}
