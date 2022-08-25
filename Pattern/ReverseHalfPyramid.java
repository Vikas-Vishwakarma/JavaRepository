import java.util.Scanner;

public class ReverseHalfPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Row: ");
		int row = sc.nextInt();
//		System.out.print("Enter number of Column: ");
//		int col = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=row;i++) {
			//Inner Loop to print Space
			for(int j=1; j<=row-i;j++) {
				System.out.print(" ");
			}
			//Inner Loop for printing * (Star)
			for(int k=1; k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
