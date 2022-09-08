/* Print matrix in spiral form
* 3 3
* 1 2 3
* 4 5 6
* 7 8 9
*
*
* 1 2 3 6 9 8 7 4 5 
*/


import java.util.Scanner;

class SpiralMatrix{
	public static void SpiralMatrixRepresentation(int[][] matrix){
		int rows = matrix.length;
		int cols = matrix[0].length;

		int top=0, bottom=rows-1, left=0, right=cols-1;

		int dir=1;

		while(left<=right && top<=bottom){
			if(dir == 1){
				for(int i=left;i<=right;i++){
					System.out.print(matrix[top][i]+" ");
				}
				top++;
				dir=2;
			} else if(dir == 2){
				for(int i=top;i<=bottom;i++){
					System.out.print(matrix[i][right]+" ");
				}
				right--;
				dir=3;
			} else if(dir == 3){
				for(int i=right;i>=left;i--){
					System.out.print(matrix[bottom][i]+" ");
				}
				bottom--;
				dir=4;
			} else {
				for(int i=bottom;i>=top;i--){
					System.out.print(matrix[i][left]+" ");
				}
				left++;
				dir=1;
			}
		}

	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();

		int[][] matrix = new int[m][n];

		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				matrix[i][j]=sc.nextInt();
			}
		}

		SpiralMatrixRepresentation(matrix);
	}
}


// Time Complexity -> O(m*n)
// Space Complexity -> O(1)