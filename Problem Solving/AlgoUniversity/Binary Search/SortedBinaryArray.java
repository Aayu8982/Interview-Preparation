import java.util.Scanner;

class SortedBinaryArray{
	static void findIndex(int[] arr, int n){
		int left=-1;
		int right=n;

		while(right-left!=1){
			int mid=(left+right)/2;
			if(arr[mid] == 0)
				left=mid;
			else
				right=mid;
		}
		System.out.println(right+" "+left);

	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		findIndex(arr,n);
	}
}