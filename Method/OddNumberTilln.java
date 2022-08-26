package com.java.Methods;

import java.util.Scanner;

public class OddNumberTilln {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		
		OddNumbers(n);
	}
	
	public static void OddNumbers(int n){
		System.out.print("List of Odd Numbers: ");
		for(int i = 1;i<=n; i++) {
			if(i %2 !=0 ) {
				System.out.print(i+" ");
			}
		}
	}
}
			