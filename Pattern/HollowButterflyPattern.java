import java.util.Scanner;

public class HollowButterflyPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		sc.close();
		
		//Upper Half
		for(int i=1;i<=n;i++) {
			//left Star
			for(int j=1;j<=i;j++) {
				if(j==1 || j == i ) {
					System.out.print("*");
				}else {
					System.out.print(" ");					
				}
			}
			//Spaces
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			//Right Star
			for(int j1=i;j1>=1;j1--) {
				if(j1==1 || j1 == i ) {
					System.out.print("*");
				}else {
					System.out.print(" ");					
				}
			}
			System.out.println();
		}
		
		
		//Lower Half
		for(int i=n;i>=1;i--) {
			//left Star
			for(int j=1;j<=i;j++) {
				if(j==1 || j == i ) {
					System.out.print("*");
				}else {
					System.out.print(" ");					
				}
			}
			//Spaces
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			//Right Star
			for(int j1=i;j1>=1;j1--) {
				if(j1==1 || j1 == i ) {
					System.out.print("*");
				}else {
					System.out.print(" ");					
				}
			}
			System.out.println();
		}
	}
}


// Sakshi: 9579475190
