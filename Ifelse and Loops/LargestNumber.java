package com.gfg.basic.java;

public class LargestNumber {
	public static void main(String[] args) {
		//Write a java program to find largest Number Among 3 Number
		int num = 10;
		int numTwo = 12;
		int numThree = 14;
		
		if(num > numTwo && num > numThree)
			System.out.println("Largest Number: "+num);
		else if(numTwo > num && numTwo > numThree)
			System.out.println("Largest Number: "+numTwo);
		else 
			System.out.println("Largest Number: "+numThree);
		
	}
}
