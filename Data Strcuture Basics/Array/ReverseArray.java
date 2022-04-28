class ReverseArray{

    static void reverse(int[] arr){
        int start =0;
        int  end= arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        reverse(arr);
        for(int aa: arr){
            System.out.print(aa+" ");
        }
    }
}