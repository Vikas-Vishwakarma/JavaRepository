package com.gfg.basic.java;

import java.util.Scanner;

public class SolutionThree {
	public static void main(String[] args) {
		//Write a java program to multiply Two floating number 

		 Scanner sc = new Scanner(System.in); 
		 float a = sc.nextFloat(); 
		 float b = sc.nextFloat(); 
		 Multiply(a, b);
		 sc.close();
	}
	public static void Multiply(float a, float b) {
		System.out.println("Multiplication: " + (a*b));
	}
}
