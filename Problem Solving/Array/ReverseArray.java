// Reverse a Array

import java.util.Scanner;

class ReverseArray{

	static void reverseArrayElements(int[] arr){
		for(int i=0,j=arr.length-1;i<j;i++,j--){
			int temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n = sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Push Elements in Array");
		for(int i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		reverseArrayElements(arr);
		System.out.println("Elements after Reverse");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

// Time Complexity -> O(n)
// Space Complexity -> O(1)