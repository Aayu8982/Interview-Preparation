// Write a program for array rotation by d elements(using temp array)

import java.util.Scanner;

public class ArrayRotation1{

	static void rotate(int[] arr,int n,int d){
		int[] temp= new int[d];
		for(int i=0;i<d;i++){
			temp[i]=arr[i];
		}

		for(int i=0;i<n-d;i++){
			arr[i]=arr[i+d];
		}

		int j=0;
		for(int i=n-d;i<n;i++){
			arr[i]=temp[j++];
		}
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
	 rotate(arr,n,d);
	 System.out.println("Array After roatation");
	 for(int aa: arr)
	 	System.out.print(aa+" ");  	
	}
}

// Time Complexity -> O(n)
// Space Complexity -> O(d)