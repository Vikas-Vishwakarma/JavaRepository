// Write a java program to print number from 1 to n, where n is user given input

import java.util.Scanner;

public class Recursion2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();
		
		printNumber(1,n);
	}

	private static void printNumber(int i, int n) {
		//base condition
		if(i == n+1) {
			return;
		}
		
		
		//print(i);
		
		System.out.print(i+" ");
		i++;
		printNumber(i, n);
		
	}
}
