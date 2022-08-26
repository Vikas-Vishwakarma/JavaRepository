package com.gfg.basic.java;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		System.out.print("Enter a Number to check whether the number is Neon Number or not: ");
		Scanner sc = new Scanner(System.in);
		int numOne = sc.nextInt();
		int numTwo = sc.nextInt();
		sc.close();
		for(int i = numOne; i<= numTwo;i++) {
			int number = i;
			int rem, sum = 0;
			int sqrt = number * number;
			
			while(sqrt != 0) {
				rem = sqrt % 10;
				sum = sum + rem;
				sqrt = sqrt / 10;
			}
			if(sum == number)
				System.out.println(number +" is a Neon Number.");
//			else
//				System.out.println(number + " is not a Neon Number");
			
		}
		
	}
}