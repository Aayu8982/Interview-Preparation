import java.util.Scanner;

class ArrayBasic{
	public static void main(String[] args){
		// Static 2D Array
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}

		// Dynamic 2D Array
		Scanner s= new Scanner(System.in);
		int rowSize= s.nextInt();
		int columSize=s.nextInt();

		int arr1[][] = new int[rowSize][columSize];
		for(int i=0;i<rowSize;i++){
			for(int j=0;j<columSize;j++){
				arr1[i][j]=s.nextInt();
			}
		}

		System.out.println("I AM MATRIX");
		for(int i=0;i<rowSize;i++){
			for(int j=0;j<columSize;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

		}
}