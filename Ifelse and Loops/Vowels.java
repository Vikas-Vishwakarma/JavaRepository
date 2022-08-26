package com.gfg.basic.java;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char y = sc.next().charAt(0);
		sc.close();
		
		if(y == 'a' || y == 'e' || y == 'i' || y == 'o'
	            || y == 'u' || y == 'A' || y == 'E' || y == 'I'
	            || y == 'O' || y == 'U')
			System.out.println(y+ " is a Vowel");
		else
			System.out.println(y+ " is a consonant");
	}

}
