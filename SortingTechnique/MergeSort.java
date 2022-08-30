import java.util.Scanner;

public class MergeSort{
    public static void divide(int[] arr, int startingIndex, int endingIndex ){
        //Base Condition
        if(startingIndex >= endingIndex) {
            return;
        }

        //Logic
        //Step 1 : we will find the middle value to divide Array into two parts 
        //To find middle value we have one more formula i.e; (startingIndex+endingIndex)/2; But some times
        // addition of startingIndex + endingIndex can exceed sizeOf Integer, for safer side we use startingIndex + (endingIndex - startingIndex)/2;
        int mid = startingIndex + (endingIndex - startingIndex)/2;

        //Step 2: We will use recursion to divide Array

        //We will call function to divide Array from left side i.e;
        divide(arr, startingIndex, mid);
        //In this call our starting index will be 0 and ending Index will be mid

        //We will call function to divide Array from right side i.e;
        divide(arr, mid+1, endingIndex);
        //In this call our starting index will be mid + 1  to ending index

        //Step 3:
        //Now we will conquer method to Merge Divide Array into sorted form
        //Here we will pass 4 parameter i.e, Array, startingIndedx, Middle Value , endingIndex
        conquer(arr, startingIndex, mid, endingIndex);
    }

    public static void conquer(int[] arr, int startingIndex, int mid, int endingIndex){
        // We will create an empty array to store sorted value in it and then copy it to Original Array

        int[] mergedArray = new int[endingIndex - startingIndex + 1];

        // step 1:  We will create variables to store value of startingIndex, mid, and keep track of index of new Array
        int idx1 = startingIndex;
        int idx2 = mid+1;
        int i = 0; //To keep track of index



        // While Loop:  We will start comparing values if values is smaller than perivous value than replace
        while(idx1<=mid && idx2<=endingIndex){
            if(arr[idx1] <= arr[idx2]){
                mergedArray[i++] = arr[idx1++];
                // i++;
                // idx1++;
            }else{
                mergedArray[i++] = arr[idx2++];
                // i++;
                // idx2++;

            }
        }

        while(idx1 <= mid){
            mergedArray[i++] = arr[idx1++];
                // i++;
                // idx1++;
        }

        while(idx2<=endingIndex){
            mergedArray[i++] = arr[idx2++];
            // i++;
            // idx1++;

        }
        
        // We will start copying it into original Array
        for(int k=0, j=startingIndex; k<mergedArray.length;k++,j++) {
            arr[j] = mergedArray[k];
        }
    }

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Values in Array: ");
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		//Printing out entered Array
		System.out.print("Array: ");
		for(int i=0; i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
		sc.close();
    	
        //here will call method divide
        divide(arr, 0, size-1);
        
    	//Printing Sorted Array
		System.out.println("\n\nSorted Array: ");
		System.out.print("[");
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.print("]");
    }
}