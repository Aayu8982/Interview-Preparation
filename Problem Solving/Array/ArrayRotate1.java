// How to rotate Array by d elements;

import java.util.*;

class ArrayRotate1{
	static void reverse(int[] arr, int start, int end){
		for(int i=start, j=end; i<j; i++,j--){
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}

	// Array Rotation from right side
	static void ArrayRoatateRight(int[] arr, int size, int d){
		reverse(arr,0,size-1);
		reverse(arr,0,d-1);
		reverse(arr,d,size-1);
	}

	// Array Rotation from left side
	static void ArrayRoatateLeft(int[] arr, int size, int d){
		reverse(arr,0,d-1);
		reverse(arr,d,size-1);
		reverse(arr,0,size-1);
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of the array");
		int size = sc.nextInt();
		
		int[] arr =new int[size];
		
		System.out.println("Push Elements in Array");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("How much time you want to rotate array");
		int d = sc.nextInt();

		//ArrayRoatateRight(arr,size,d);
		

		ArrayRoatateLeft(arr,size,d);

		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

// Time Complexity ->O(n)
// Space Complexity -> O(1)