package com.java.patterns;

import java.util.Scanner;

public class DiamondPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 1;i<=n;i++) {
			//Upper Half --> Spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//Upper Half
			for(int k = 1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = n;i>=1;i--) {
			//Upper Half --> Spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//Upper Half
			for(int k = 1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
