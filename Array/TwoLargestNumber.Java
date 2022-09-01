// Java Examples on finding largest and smallest Numbers in Array
// Write a java Program to find the largest two Number in Array

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoLargestNumber {

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
		Arrays.sort(arr);
		System.out.println("First Largest Number: "+arr[n-1]);
		System.out.println("Second Largest Number: "+arr[n-2]);
	}
}
