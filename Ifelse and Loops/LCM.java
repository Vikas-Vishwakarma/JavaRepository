package com.gfg.basic.java;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number of find LCM: ");
		int n1 = sc.nextInt();
		System.out.print("Number One: "+n1);
		int n2 = sc.nextInt();
		System.out.println("Number Two: "+n2);
		sc.close();
		int lcm = 0, gcd = 1;
		for(int i = 1; i <= n1 && i <= n2 ;i++) {
			if(n1%i ==0 && n2 % i == 0) {
				gcd = i;System.out.println(gcd);
				
			}
			lcm = (n1 * n2) / gcd;	  
		}
		System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
		

		
		
		
		
//		int lcm = (n1>n2)?n1:n2;
//		
//		while(true) {
//			if(lcm % n1 == 0 && lcm % n2 == 0) {
//				System.out.println("LCM: "+lcm);
//				break;
//			}
//			++lcm;
//		}
		
		
		
	}

}
