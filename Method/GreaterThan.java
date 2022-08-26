package com.java.Methods;

import java.util.Scanner;

public class GreaterThan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers: ");
		System.out.print("A: ");
		int a = sc.nextInt();
		System.out.print("B: ");
		int b = sc.nextInt();
		sc.close();
		
		greaterNumber(a,b);
	}
	public static void greaterNumber(int a, int b ){
		if(a > b) {
			System.out.println(a+ " is greater than "+b);
		}else {
			System.out.println(b+ " is greater than "+a);
		}
	}
}
