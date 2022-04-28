import java.util.Scanner;

class ArrayOperation{
    static void print(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int addAtEnd(int[] arr,int n,int capacity, int key){
        if(n>=capacity)
            return n;
        arr[n]=key;
        return n+1;
    }

    static int findElement(int[] arr, int n, int key){
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    static int deleteElement(int[] arr, int n, int key){
        int pos = findElement(arr,n,key);
        if(pos == -1){
            System.out.println("Element not found");
        }
        for(int i=pos;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        return n-1;
    }


    public static void main(String[] args){
       int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;

        int capacity =20;
        int n =6;
        int key=16;
        
        print(arr,n);
        n = addAtEnd(arr,n,capacity,key);
        print(arr,n);
        n= deleteElement(arr,n,key);
        print(arr,n);
    }
}

// Search -> O(n)
// insertatend -> O(1)
//Delete -> O(n)