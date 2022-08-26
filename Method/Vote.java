package com.java.Methods;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		sc.close();
		
		 ageCalculation(age);
	}
	public static void ageCalculation(int age) {
		if(age >= 18) {
			System.out.println("Your eliglible  for Voting.");
		}else {
			System.out.println("Your Not Eliglible for Voting.");
		}
	}
}
