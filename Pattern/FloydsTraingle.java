import java.util.Scanner;

public class FloydsTraingle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Row: ");
		int row = sc.nextInt();
		sc.close();
		int count = 1;
		
		
		
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
	}

}
