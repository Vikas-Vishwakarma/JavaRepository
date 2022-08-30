package com.java.recursion;

import java.util.Scanner;

public class Move {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: "); //abxcdexfxx example
		String str = sc.next();
		System.out.println("Enter a character to move at last: "); // x
		char ch = sc.next().charAt(0);
		sc.close();
		str.toLowerCase();
		Character.toLowerCase(ch);
		
		moveSequence(str, ch, 0, 0, "");// String, Character, index
	}

	private static void moveSequence(String str, char ch, int idx, int count, String newString) {
	
		//Base Condition
		if(idx == str.length()) {
			for(int i=0; i<count; i++) {
				newString += ch;
			}
			System.out.println(newString);
			return;
		}
		
		
		//Logic == Kaam
		if(str.charAt(idx) == ch) {
			count++;
			moveSequence(str, ch, idx+1, count,newString);		
		}else {
			newString += str.charAt(idx);
			moveSequence(str, ch, idx+1, count,newString);
		}
	}
}
