package com.gfg.basic.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SolutionOne {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//There are two methods to take input from user 
		//1. Scanner
		//2. BufferedReader
		
		//Using Scanner
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entered Integer: "+sc.nextInt());
		sc.close();
		
		//Using BufferedReader
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Integer: ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Entered Integer: "+a);
		
		
	}
}
