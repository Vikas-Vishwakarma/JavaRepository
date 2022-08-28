package com.java.recursion;
// Write a java program to find x raise to th power n(stack height = logn)
import java.util.Scanner;

public class xPowern_logn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
		int x = sc.nextInt();
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("Answer: "+calcPower(x, n));
	}
	
	public static int calcPower(int x, int n) {
		//Base Condition
		if(x == 0) {
			return 0;
		}
		
		//Base Condition
		if(n == 1) {
			return 1;
		}

		//if n == even
		if(n % 2 == 0) {
			return calcPower(x, n/2) * calcPower(x, n/2);
		}else {
			//if the number is Odd
			return calcPower(x, n/2) * calcPower(x, n/2) * x;
		}
	}
}

Explanation: 
x^n  
