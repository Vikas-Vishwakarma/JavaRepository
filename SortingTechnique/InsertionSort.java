import java.util.Scanner;

public class InsertionSort {
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the values: ");
		for(int i=0; i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		System.out.print("Values: ");
		//print Elements of array
		for(int values:arr) {
			System.out.print(values+ " ");
		}
		System.out.println("\nSorted Order: ");
		
		//Insertion sort
		for(int i=1;i<arr.length;i++) {
			int current = arr[i];
			int j = i-1;
			
			while(j>=0 && current < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			//placement 
			
			arr[j+1] =current;
		}
		
//		call
		printArray(arr);
	}
}
