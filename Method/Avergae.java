package com.java.Methods;

import java.util.Scanner;

public class Avergae {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number to find average: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =  sc.nextInt();
		sc.close();
		average(a,b,c);
	}
	public static void average(int a, int b, int c) {
		System.out.println("Avergae: "+ (a+b+c)/3);
	}
}
