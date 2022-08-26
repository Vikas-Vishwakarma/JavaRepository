package com.gfg.basic.java;

import java.util.Scanner;

public class VowelsinString {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
			String str = sc.next();
			sc.close();
			
			for(int i = 0; i< str.length();i++) {
				char y = str.charAt(i);
				if(y == 'a' || y == 'e' || y == 'i' || y == 'o'
			            || y == 'u' || y == 'A' || y == 'E' || y == 'I'
			            || y == 'O' || y == 'U')
					System.out.println(y+ " is a Vowel");
				else
					System.out.println(y+ " is a consonant");
			
		}
	}

}
