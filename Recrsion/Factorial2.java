import java.util.Scanner;

public class Factorial2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println(calcFactorial(n));// Calling and Printing in same line
	}
	private static int calcFactorial(int n) {
		//Base Condition
		if(n == 1 || n == 0) {
			return 1;
		}
		int fnm = calcFactorial(n-1);
		int fact = n * fnm;		
		return fact;
	}

}