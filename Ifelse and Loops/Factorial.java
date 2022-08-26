package com.gfg.basic.java;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		long result = 1;
		for(int i = 2;i <= number;i++) {
			//result = result * i;
			result *= i;
		}
		System.out.println("Factorial of "+number+" is: "+result);
	}
}
