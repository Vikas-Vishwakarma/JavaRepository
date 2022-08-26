package com.gfg.basic.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdd {
	public static void main(String[] args) throws IOException {
		//Write a java program to find Number is even or Odd
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Number To check Even or Odd: ");
		int num = Integer.parseInt(br.readLine());
		
		if(num == 0 ) 
			System.out.println("0 is nor Even neither Odd");
		
		else if (num % 2 == 0 ) 
			System.out.println("Even Number: "+num);
		
		else 
			System.out.println("Odd Number: "+num);
		
		
	}

}
