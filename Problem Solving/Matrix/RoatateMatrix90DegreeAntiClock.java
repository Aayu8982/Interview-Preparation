// Rotate matrix by 90 degree anti clockwise
/*
* Input
* 3 3
* 1 2 3
* 4 5 6
* 7 8 9
*
*
* output
* 3 6 9 
* 2 5 8 
* 1 4 7 
*
*/

import java.util.Scanner;

class RoatateMatrix90DegreeAntiClock{

	static void reverse(int i,int[][] mat){
		int start=0;
		int end=mat.length-1;
		while(start<end){
			int temp = mat[i][start];
			mat[i][start]=mat[i][end];
			mat[i][end]=temp;
			start++;
			end--;
		}

	}

	static void rotateMatrix(int[][] mat,int row,int col){
		for(int i=0;i<row;i++){
			reverse(i,mat);
		}

		for(int i=0;i<row;i++){
			for(int j=i;j<col;j++){
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			}
		}

	}



	static void display(int[][] mat){
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();

		int[][] mat=new int[row][col];

		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				mat[i][j]=s.nextInt();
			}
		}

		rotateMatrix(mat,row,col);
		display(mat);

	}
}

// Time Complexity -> O(n*n)
// Space Complexity -> O(1)