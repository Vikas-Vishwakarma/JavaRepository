package com.java.patterns;

public class SolidRombus {

	public static void main(String[] args) {
		int n =5;
		
		for(int i=1;i<=n;i++) {
			//Spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//Star
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
