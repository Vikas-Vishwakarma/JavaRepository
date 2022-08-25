import java.util.*;

public class Butterfly {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
	int n = sc.nextInt();
	sc.close();
		
		//Upper Half
		for(int i =1; i<=n;i++) {
			
			//Printing star --> Left Side First
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			
			//Print Space
			for(int j=1;j<= 2*(n-i); j++) {
				System.out.print(" ");
			}
			
			//Print star --> Right Side
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Lower Half
		for(int i =n; i>=1;i--) {
			//Printing star --> Left Side First			
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			//Print Spaces
			for(int j=1;j<= 2*(n-i); j++) {
				System.out.print(" ");
			}
			//Print star --> Right Side
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
