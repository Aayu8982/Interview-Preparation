import java.util.Scanner;

class DirectBinarySearch{
	static int binarySearch(int[] arr,int n, int target){
		int left=0;
		int right=n-1;

		while(left<=right){
			int mid=(left+right)/2;
			if(arr[mid]==target){
				return mid;
			}else if(arr[mid]>=target){
				right=mid;
			} else{
				left=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();

		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<q;i++){
			int target=sc.nextInt();
			System.out.println(binarySearch(arr,n,target));
		}
	}
}