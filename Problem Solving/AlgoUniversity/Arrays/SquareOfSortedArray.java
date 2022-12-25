import java.util.*;

public class SquareOfSortedArray{
	static int[] squareOfArray(int[] arr, int n){
		int left=0;
		int right=n-1;
		int k=n-1;

		int[] result=new int[n];

		while(left<=right){
			int leftSquare=arr[left]*arr[left];
			int rightSquare=arr[right]*arr[right];
			
			if( leftSquare>= rightSquare){
				result[k--]=leftSquare;
				left++;
			} else {
				result[k--]=rightSquare;
				right--;
			}
		}
		return result;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]= sc.nextInt();
		}
		int[] data = squareOfArray(arr, n);
		for(int aa: data){
			System.out.print(aa+" ");
		}
	}
}