package com.gfg.basic.java;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		int gcd = 0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter two numbers to find GCD: ");
		 int a = sc.nextInt();
		 int b = sc.nextInt();		 
		 sc.close();
		 
		 for(int i = 1;  i <= a && i <= b; i++) {
			 if(a % i == 0 && b % i == 0) {
				 gcd = i;
			 }
		 }
		 System.out.println("GCD: "+gcd);
	}	
}
