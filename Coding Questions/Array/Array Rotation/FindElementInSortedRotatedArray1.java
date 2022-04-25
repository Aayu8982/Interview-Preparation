// Find Element in sorted rotated array.

class FindElementInSortedRotatedArray1{
    
    static int findElement(int[] arr,int num){
        if(arr == null || arr.length ==0)
          return -1;
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==num)
                return mid;
            else if(arr[start]<arr[mid]){
                if(arr[start]<=num && num<=arr[mid]){
                    end=mid-1;
                } else{
                    start=mid+1;
                }
            } else {
                if(arr[mid]<=num && num<=arr[end]){
                    start=mid+1;
                } else{
                    end=mid-1;
                }
            }
        }  
        return -1;  
    }

    public static void main(String[] args){
        int[] arr = {5,6,7,8,9,10,1,2,3,4};
        int element = 7;
        int result=findElement(arr,element);
        if(result > -1) {
            System.out.println("Element available at index "+result);
        }  else {
            System.out.println("Element not available in array");
        } 
    }
}

// Time Complexity -> O(logn)
// Space Complexity -> O(1)