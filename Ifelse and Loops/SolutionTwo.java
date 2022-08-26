package com.gfg.basic.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SolutionTwo {
	public static void main(String[] args) throws NumberFormatException ,IOException {
		/*
		 * There are four different ways to take input from user.
		 * Using BufferedReader
		 * Using Scanner
		 * Using CommandLine Arguments
		 * Using System console
		 */
		
		//Using BufferedReader
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * System.out.println("String: "+br.readLine());
		 * System.out.println("Byte: "+Byte.parseByte(br.readLine())); 
		 * Byte: 127
		 * System.out.println("Short: "+Short.parseShort(br.readLine())); 
		 * Short: 32767
		 * System.out.println("Integer: "+Integer.parseInt(br.readLine())); 
		 * Integer: 2147483647
		 * System.out.println("Long: "+Long.parseLong(br.readLine()));
		 * Long: 9223372036854775807
		 */
		
	
//		Using Scanner Class
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter String: ");
		 * System.out.println("Entered String: "+sc.next());
		 * 
		 * System.out.println("Enter Char: "); System.out.println("Entered Char: "+
		 * sc.next());
		 * 
		 * System.out.println("Enter Byte: ");
		 * System.out.println("Entered Byte: "+sc.nextByte());
		 * 
		 * System.out.println("Enter Short: ");
		 * System.out.println("Entered Short: "+sc.nextShort());
		 * 
		 * System.out.println("Enter Integer: ");
		 * System.out.println("Entered Integer: "+sc.nextInt());
		 * 
		 * System.out.println("Enter Long: ");
		 * System.out.println("Entered Long: "+sc.nextLong());
		 */
		
		//Using System Console
		
		/*
		 * System.out.println("Enter Your Name: "); String name =
		 * System.console().readLine(); System.out.println("Name: " +name);
		 * Note: 
		 * Eclipse causes a Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.io.Console.readLine()" because the return value of "java.lang.System.console()" 
		   is null at com.gfg.basic.java.SolutionTwo.main(SolutionTwo.java:58) 
		 * This is because Eclipse uses the javaw.exe program to run Java code, not the java.exe command.
		 * The ‘w’ in ‘javaw’ indicates that the program will run without access to the Java Console. As a result, a NullPointerError ensues.
		 */
		
		
		
		
	}
}
