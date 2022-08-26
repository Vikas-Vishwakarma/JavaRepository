package com.gfg.basic.java;

import java.util.Scanner;

public class ArmstrongNumberList {
	public static void main(String[] args) {
		System.out.println("Find Armstrong Number  for 3 digit Number");
		System.out.println("Enter a Range of Number: ");
		Scanner sc = new Scanner(System.in);
		int numOne = sc.nextInt();
		int numTwo = sc.nextInt();
		sc.close();
	
		for( int i = numOne; i <= numTwo; i++) {
			
			int count = 0, arm = 0, t1 = i;
			
			while(t1 != 0) {
				count = count + 1;
				t1 = t1 / 10;
			}
			
			int t2 = i;
			while(t2 != 0) {
				int sum = 1;
				int rem = t2 % 10;
				for(int j = 1; j <= count; j++) {
					sum = sum * rem;
				}
				arm = arm + sum;
				t2 = t2 / 10;
			}
			if(arm == i)
				System.out.println(i + " is a Armstrong Number.");	

		}
	}
}

