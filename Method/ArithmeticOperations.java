package com.java.Methods;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		Add(a,b);
		Sub(a,b);
		Div(a,b);
		Multi(a,b);
		
	}

	public static void Add(int a, int b) {
		System.out.println("Addition: "+ (a +b));

	}
	public static void Sub(int a, int b) {
		System.out.println("Substraction: "+ (a - b));
	}
	public static void Div(int a, int b) {
		System.out.println("Division: "+ (a % b));
	}
	public static void Multi(int a, int b) {
		System.out.println("Multiplication: "+ (a * b));
	}
}
