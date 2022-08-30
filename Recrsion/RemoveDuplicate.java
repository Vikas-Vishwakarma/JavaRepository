package com.java.recursion;

import java.util.Scanner;

public class RemoveDuplicate {
	
	public static boolean[] map = new boolean[26];
	
	//Recursive Function
	public static void removeDuplicates(String str, int index, String newString) {
		//Base Condition
		if(index == str.length()) {
			System.out.println(newString);
			return;
		}
		
		//Logic == Kaam
		
		char currentCharacter = str.charAt(index);
		if(map[currentCharacter - 'a']) { //True is already implied in java
			removeDuplicates(str, index+1, newString);
		}else {
			newString += currentCharacter;
			map[currentCharacter - 'a'] = true;
			removeDuplicates(str, index+1, newString);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
		sc.close();
		removeDuplicates(str.toLowerCase(), 0, "");
	}
	

}
