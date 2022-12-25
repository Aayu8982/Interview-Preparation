// Bubble Sort Implementation

class BubbleSort{

	static void bubbleSortAlgo(int[] arr, int n){
		int flag;
		for(int i=0;i<n-1;i++){
			flag=0;
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
	}

	public static void main(String[] args){
		int[] arr ={15,4,13,2,1,17,11,7};
		int n =arr.length;
		bubbleSortAlgo(arr,n);
		for(int aa:arr){
			System.out.print(aa+" ");
		}
	}
}

// Time Complexity -> O(n^2)
// Space Complexity -> O(1)