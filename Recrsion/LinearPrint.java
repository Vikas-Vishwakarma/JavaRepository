// Write a Java Program to Print Number from 5 to 1; That is, 5,4,3,2,1 Using Recursion


import java.util.Scanner;

public class LinearPrint{

    public static void printNumber(int n){
        //base case
        if(n<=0){
            return;
        }
        System.out.print(n+" ");
        printNumber(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        sc.close();

        printNumber(n);
        
    }
}