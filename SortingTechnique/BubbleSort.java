import java.util.Scanner;

public class BubbleSort {
	
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
		
		//Bubble sort
		for(int i=0;i<arr.length-1; i++) {
			for(int j=0;j<arr.length-i-1;j++) {
//				Condition to check if the number is greater or not!
				if(arr[j] > arr[j+1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
//		call
		printArray(arr);
	}

}
