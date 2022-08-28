import java.util.Scanner;

public class Factorial {
	//Write a Java program to print Factorial of a number;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();

		/*
		 * parameter Required to print factorial 
		 * 1 - Starting parameter
		 * n - Condition to check - Till
		 * where it should check where it shall end 
		 * PrintFactorial(start, conditioncheck,mult = 1); 
		 */
		
		printFactorial(1, n, 1);
	}
	
	public static void printFactorial(int i, int n, int mult) {
		//Base Condition
		if(i == n) {
			mult *=i;
			System.out.println("Factorial: "+mult);
			return;
		}
		//Calculate Factorial
		mult *= i;
		i++;
		printFactorial(i, n, mult);
			
	}

}
