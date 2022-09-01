//Java Examples on Inserting and Deleting elements to and from an Array
//Java program to put Even and Odd elements of an Array in 2 separate Array

import java.util.Scanner;

public class EvenOddElement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.print("Enter values in Array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Entered Array: ");
		printArray(arr);
		int even = 0, odd = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0)
				even++;
			else
				odd++;
			
		}
		evenOdd(arr, even, odd);
	}

	private static void evenOdd(int[] array, int evenNumber, int oddNumber) {

		int[] even = new int[evenNumber];
		int[] odd = new int[oddNumber];
		int j=0,k = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) 
				even[j++] = array[i];
			else 
				odd[k++] = array[i];
		}
		System.out.print("Even Array: ");
		printArray(even);
		System.out.print("Odd Array: ");
		printArray(odd);
	}

	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}