package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestandSmallestElement {
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
		System.out.println("Smallest Element: "+arr[0]);
		System.out.println("Largest Element: "+arr[n-1]);
	}

}
