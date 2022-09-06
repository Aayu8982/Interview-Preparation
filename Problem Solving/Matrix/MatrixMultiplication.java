/* Multiplication of 2 Matrix
* first
*  2 3
* 1 2 3
* 4 5 6
*
* second
* 3 4
* 1 2 3 4
* 5 6 7 8
* 9 10 11 12
*
* output 
* 38 44 50 56 
* 83 98 113 128 
*/


import java.util.*;

class MatrixMultiplication{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		
		// First Matrix
		int r1=s.nextInt();
		int c1=s.nextInt();

		int[][] one = new int[r1][c1];

		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				one[i][j]=s.nextInt();
			}
		}

		// Second Matrix
		int r2=s.nextInt();
		int c2=s.nextInt();

		int[][] two = new int[r2][c2];

		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				two[i][j]=s.nextInt();
			}
		}

		if(r2 != c1){
			System.out.println("Invalid Matrix");
		}

		// Multiplication
		int[][] prod = new int[r1][c2];

		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				for(int k=0;k<c1;k++){
					prod[i][j]+= one[i][k]*two[k][j];
				}
			}
		}

		// Display
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				System.out.print(prod[i][j]+" ");
			}
			System.out.println();
		}

	}
}