import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();
		int a = 0,b = 1;
		System.out.print(a+" "+b+" ");
		printFib(0, 1 , n-2);		
	}

	private static void printFib(int a, int b, int n) {
		if(n == 0) {
			return;
		}
		int c = a+b;
		System.out.print(c+" ");
		printFib(b, c, n-1);
	}
}
