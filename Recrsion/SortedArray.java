// Write a java Program to Check if the Array is Sorted or not(Strictly Incremental)

import java.util.Scanner;

public class SortedArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = sc,nextInt();
        System.out.println("Enter Values: ");
        for(int i = 0; i<size;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(isSortedArray(arr, 0));
    }

    public static boolean isStatic(int[] arr, int index){
        //Base Condition
        if(index == arr.length - 1){
            return true;
        }

        //Logic
        if(arr[index] < arr[index+1]){
            return isSortedArray(arr, index+1);
        }else{
            return false;
        }

        //Second Way (Bit Optimized)
        
        //Base Condition
        // if(index == arr.length - 1){
        //     return true;
        // }

        // //Logic 
        // if(arr[i] >= arr[i+1]){
        //     return false;
        // }else{
        //     return isSortedArray(arr, index+1);
        // }
    }
}