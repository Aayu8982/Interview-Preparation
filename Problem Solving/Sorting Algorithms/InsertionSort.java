// Insertion Sort


class InsertionSort{
	static void insertionSort(int[] arr,int n){
		for(int i=1;i<n;i++){
			int temp=arr[i];
			int j=i-1;

			while(j>=0 && arr[j]>temp){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args){
		int[] arr = {8,5,4,6,2,1,3};
		int n=arr.length;
		insertionSort(arr,n);
		for(int aa: arr){
			System.out.print(aa+" ");
		}
	}
}


// Time Complexity ->O(n^2)
// Space Complexity ->O(1)