import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array: ");
		int size =sc.nextInt();
		System.out.println("Enter Values in Array: ");
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.print("Array: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		quickSort(arr, 0, size -1);
		
		//Print
		System.out.print("Sorted Array: ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void quickSort(int[] arr, int low, int high) {
		//Base Condition{
		if(low > high) {
			return;
		}
		int pivot = partition(arr, low, high);
		
		quickSort(arr, low, pivot-1);
		quickSort(arr, pivot+1, high);
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;

		for(int j=low; j<high;j++) {
	
			if(arr[j] < pivot) {
				i++;
				//Swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
	}
}