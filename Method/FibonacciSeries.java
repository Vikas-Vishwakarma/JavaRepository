package com.java.Methods;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		 fibonacci(a);

	}
	public static void fibonacci(int count) {
		//In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
		
		int n1 = 0;
		int n2 = 1; 
		int n3;
		System.out.print(n1+ " "+n2);
		
		for(int i =2;i < count;i++) {
			n3 = n1+n2;
			System.out.print(" "+ n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
