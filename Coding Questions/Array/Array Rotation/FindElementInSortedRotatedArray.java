// Find Element in sorted rotated array.

class FindElementInSortedRotatedArray{
    static int binarySearch(int[] arr,int element, int start,int end){
       while(start<=end){
           int mid = (start+end)/2;
        if(arr[mid]==element)
           return mid;
        else if(element<arr[mid])
            end=mid-1;
        else
            start=mid+1;
       } 
        return -1;
    }

    static int findPivot(int[] arr){
        if(arr[0]<arr[arr.length-1]){
            return -1;
        }
        int start = 0,end =arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>arr[mid+1])
                return mid+1;
            if(arr[start]<=arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    
    static int findElement(int[] arr,int element){
        int pivot = findPivot(arr);
        if(element>=arr[0] && element <=arr[pivot-1])
            return binarySearch(arr,element,0,pivot-1);
        else
            return binarySearch(arr,element,pivot,arr.length-1);
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