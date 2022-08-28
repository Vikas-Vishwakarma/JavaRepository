import java.util.Scanner;

public class xPowern {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
		int x = sc.nextInt();
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("Answer: "+calculatePower(x, n));
		
	}
	
	public static int calculatePower(int x, int n) {
		//Base condition 1
		if(n == 0) {
			return 1;
		}
		//Base Condition 2
		if(x==0) {
			return 0;
		}
		//Kaam
		int x1 = calculatePower(x, n-1);
		return x1 * x;
	}
}
