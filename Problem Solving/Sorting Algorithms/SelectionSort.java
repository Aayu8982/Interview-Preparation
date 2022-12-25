class SelectionSort{

	static void selectionSort(int[] arr,int n){
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String[] args){
		int[] arr ={8,4,1,5,9,2};
		int n=arr.length;
		selectionSort(arr,n);
		for(int elementInArr: arr){
			System.out.print(elementInArr+" ");
		}
	}
}

// Time Complexity -> O(n^2)
// Space Complexity -> O(1)