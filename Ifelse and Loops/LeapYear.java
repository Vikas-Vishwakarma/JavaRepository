package com.gfg.basic.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		br.close();
		
		if((year % 400 == 0)|| (year % 4 == 0 ) && (year % 100 != 0)) 
			System.out.println(year+" is a Leap Year.");
		else 
			System.out.println(year+ " not a Leap Year.");
	}
}
