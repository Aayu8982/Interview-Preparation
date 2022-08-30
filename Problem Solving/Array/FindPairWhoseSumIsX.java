/* 
* Given an array A[] and a number x, check for pair in A[] with sum as x (aka Two Sum)
* Input -> {0, -1, 2, -3, 1}
* target -> 2
* output -> (-3,1)
*/


import java.util.*;

class FindPairWhoseSumIsX{

	// Approch 1(Brute Force Approch)
	public static void findPair(int[] arr, int target){
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]+arr[j] == target){
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
	// Time Complexity -> O(n^2)
	// Space Complexity ->O(1)

	// Approch 2 (Two Pointer Approch)
	public static void findPair(int[] arr, int target){
		Arrays.sort(arr);
		int left =0;
		int right =arr.length-1;

		while(left<right){
			if(arr[left]+arr[right] == target){
				System.out.println(arr[left]+" "+arr[right]);
				left++;
				right--;
			} else if(arr[left]+arr[right]<target){
				left++;
			} else{
				right--;
			}
		}
	}
	// Time Complexity -> O(nlogn) depends upon sorting algorithm
	// Space Complexity ->O(n) if merge sort O(1) HeapSort

	//Approch 3 (Hashing)
	public static void findPair(int[] arr, int target){
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
			int temp= target-arr[i];
			if(h.contains(temp)){
				System.out.println(arr[i]+" "+temp);
			}
			h.add(arr[i]);
		}
	}

	// Time Complexity ->O(n)
	// Space Complexity ->O(n)


	public static void main(String[] args){
		int[] arr={9,4,3,2,5,7,6,1,8};
		int target= 10;
		findPair(arr, target);
	}
}