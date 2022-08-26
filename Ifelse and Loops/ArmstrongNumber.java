package com.gfg.basic.java;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {

		int count = 0, arm = 0;
		
		System.out.println("Enter Numbers: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int t1 = number;
		
		while(t1 != 0) {
			count = count+1;
			t1 = t1/10;
			System.out.println("Number: "+t1);
		}
		System.out.println("Count: "+count);
		int t2 = number;
		while(t2 != 0) {
			
			int rem = t2% 10;
			int result = 1;
			for(int i = 1;i<=count;i++) {
				result = result * rem;
			}
			arm = arm+result;
			t2 = t2 /10;
		}
		if (number == arm) {
			System.out.println("Armstrong Number: "+ number);
		}else {
			System.out.println("Not a Armstrong Number: "+ number);
		}
		
	}

}
