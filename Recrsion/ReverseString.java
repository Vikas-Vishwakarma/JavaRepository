import java.util.Scanner;

public class ReverseString{

    public static void printRev(String str, int index){
        //Base Condition
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        
        //Logic
        System.out.print(str.charAt(index));
        printRev(str, index - 1);
    }    

    public static void mian(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();
        sc.close();
        System.out.println("Reversed String: ");
        printRev(str, str.length() - 1); 

    }
}