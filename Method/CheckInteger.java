package com.java.Methods;

import java.util.Scanner;

public class CheckInteger {
//	Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number (postive, zero or negative): ");
		int a = sc.nextInt();
		sc.close();		
		
		check(a);
	}
	public static void check(int a) {
		if(a > 0) {
			System.out.println(a+ " is Postivie");
		}else if(a < 0) {
			System.out.println(a+ " is Negative");
		}else {
			System.out.println(a+ " is Zero");
		}

	}
}
