import java.util.Scanner;

public class SumofFirstnNaturalNumbers {
	
	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		
		/*
		 * Counter Variable that starts from 1 and will update it later; Sum of the
		 * numbers i.e, 0
		 * so 1st parameter is a counter variable 
		 * 2nd parameter is n till where we should go 
		 * 3rd parameter is sum of that number;
		 */
		
		printSum(1, n , 0);
		
	}

	private static void printSum(int i, int n, int j) {
		// TODO Auto-generated method stub
		
		if(i == n) {
			j += i;
			System.out.println("sum: "+j);
			return;
		}
		
		j += i;
		printSum(i+1, n, j);
	}

}
