/* Create Diagonal Matrix
* arr= [1 2 3 4 5]
* 
* output
* 1 0 0 0 0 
* 0 2 0 0 0 
* 0 0 3 0 0 
* 0 0 0 4 0 
* 0 0 0 0 5 
*/



import java.util.*;
class DiagonalMatrix{

	public static void createDiagonalMatrix(int[] arr,int[][] mat, int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
			if(i==j)
				mat[i][j]=arr[i];
			else
				mat[i][j]=0;
		}
	}
	}

	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int mat[][]=new int[n][n];
		createDiagonalMatrix(arr,mat,n);

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}