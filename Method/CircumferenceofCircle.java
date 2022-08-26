package com.java.Methods;

import java.util.Scanner;

public class CircumferenceofCircle {
	public static void main(String[] args) {
	//Write a function that takes in the radius as input and returns the circumference of a circle.	
		System.out.print("Enter a Radius: ");
		Scanner sc = new Scanner(System.in);
		double rad = sc.nextDouble();
		sc.close();
		
		circumference(rad);
	}
	public static void circumference(double n) {
		//double value = 2*3.14 *n *n;
		System.out.println("Circumference of Circle: "+ (2*3.14 *n *n));
	}
}
