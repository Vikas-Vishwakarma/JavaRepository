//Write a java Program to Insert an Element in a Specified Position in an give array

import java.util.Scanner;

public class InsertElement {

		public static void specificPosition(int[] array, int element, int position) {
		int[] copyArray = new int[array.length+1];
		
		 for (int i = 0; i < array.length + 1; i++) {
	            if (i < position - 1)
	                copyArray[i] = array[i];
	            else if (i == position - 1)
	            	copyArray[i] = element;
	            else
	            	copyArray[i] = array[i - 1];
	        }
		printArray(copyArray);
	}

	public static void printArray(int[] array) {
		System.out.print("Array: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.print("Enter values in Array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Element you want to insert: ");
		int element = sc.nextInt();
		System.out.println("Enter at which position you want to enter: ");
		int position = sc.nextInt();
		sc.close();
		//Function to Print Array
		printArray(arr);	
		//Function to Place element at its position
		specificPosition(arr, element, position);
	}
}
