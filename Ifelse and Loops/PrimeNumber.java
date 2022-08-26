package com.gfg.basic.java;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();

		boolean flag = false;

		if (input == 0 || input == 1) {
			System.out.println(input + " is neither prime nor composite");
		}else {
			for (int i = 2; i <= input; i++) {
				for (int j = 2; j <= i - 1; j++) {

					if (i % j == 0) {
						flag = true;
					}
				}
				if (flag == false) {
					System.out.print(i+" ");
				} else {
					flag = false;
				}
			}
		}
	}
}
