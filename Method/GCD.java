package com.java.Methods;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		System.out.println("Enter two Number to find GCD: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		greatestCommonDivisior(a,b);		
	}
	public static void greatestCommonDivisior(int a, int b) {
		int gcd = 1;
		
		for(int i=1; i<=a && i<=b; i++) {
			if(a%i==0 && b%i==0) {
				gcd =i;
			}
		}
		System.out.println("GCD: "+gcd);
	}
}


