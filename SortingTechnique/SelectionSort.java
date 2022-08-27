import java.util.Scanner;

public class SelectionSort {
	
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
		
		//Selection sort
		for(int i=0;i<arr.length-1;i++) {
			int smallest = i;
			for(int j = i+1; j<arr.length;j++) {
				if(arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			//Swap
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;		
		}
		
//		call
		printArray(arr);
	}
}
