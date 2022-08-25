import java.util.Scanner;

public class InverterHalfPyramidwithNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Row: ");
		int row = sc.nextInt();
		sc.close();
		
		
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
//		Output
//		1 2 3 4 5 
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1 

		System.out.println();
		
	 	for(int i=row; i>=1; i--) {
			for(int j=i;j>=1;j--) {
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
//		Output
//		5 4 3 2 1 
//		4 3 2 1 
//		3 2 1 
//		2 1 
//		1 
	}

}
