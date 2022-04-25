// Write a program for Array Rotation by d elements.(Reversal Algorithm)

import java.util.Scanner;

public class ArrayRotation2 {
   
    static void reverse(int[] arr,int start, int end){
        for(int i=start,j=end; i<j; i++,j-- ){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    
	// Left Rotate 
    static void leftRotate(int[] arr, int n, int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }

	// Right Rotate
	static void rightRotate(int[] arr, int n, int d){
        reverse(arr, 0, n-1);
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
	    System.out.println("Enter the size of Array");
	    int n = s.nextInt();
	    int[] arr = new int[n];
	    System.out.println("Enter elements in Array");
	    for(int i=0;i<n;i++){
	     arr[i] = s.nextInt();
	    }
	    System.out.println("How much time you want to rotate an array");
	    int d= s.nextInt();
	    s.close();
	    leftRotate(arr,n,d);
	    System.out.println("Array After rotation");
	    for(int aa: arr)
	 	  System.out.print(aa+" ");  	
	    }
}

// Time Complexity -> O(n)
// Space Complexity -> O(1)
