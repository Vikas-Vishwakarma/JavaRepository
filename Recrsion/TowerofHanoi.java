//Write a java program to print Logic for Tower of Hanoi

import java.util.Scanner;

public class TowerofHanoi{

    private static void towerOfHanoi(int n, String Source, String Helper, String Destination) {
		//Base Condition
		if(n == 0) {
			return;
		}
		towerOfHanoi(n-1, Source, Destination, Helper);
		System.out.println("Transfer Disk "+n+" from "+ Source+"to "+Destination);
		towerOfHanoi(n-1, Helper, Source, Destination);	
	}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Disk: ");
        int n = sc.nextInt();
        sc.close();

        towerOfHanoi(n, "Source", "Helper", "Destination");

    }
}
