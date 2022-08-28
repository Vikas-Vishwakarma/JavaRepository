// Write a java Program to find first and last occurrence of particular character in a string

import java.util.Scanner;

public class FindOccurence{
    public static int first = -1;
    public static int last = -1;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();
        char key = sc.next().charAt(0);
        sc.close();
        str = str.toLowerCase();
        key = Character.toLowerCase(key);
        findOccurence(str, 0, key);
    }

    public static void findOccurence(String str, int index, char key){
        //Base Condition
        if(str.length() == index){
            System.out.println("First Occurrence of "+key+" at index position: "+ first);
            System.out.println("Last Occurrence of "+key+" at index position: "+ last);
        }

        //Logic
        char  currentCharacter = str.charAt(index);
        if(currentCharacter == key){
            if(first == -1){
                first = index;
            }else{
                last = index;
            }
        }
        findOccurence(str, index+1, key);
    }
}