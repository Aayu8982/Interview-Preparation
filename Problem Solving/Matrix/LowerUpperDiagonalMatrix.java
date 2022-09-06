/* Print lower and upper diagonal of matrix
*	
* 	Lower Diagonal
*	1 0 0 0 0 
*	1 2 0 0 0 
*	1 2 3 0 0 
*	1 2 3 4 0 
*	1 2 3 4 5 
*	Upper Diagonal
*	1 2 3 4 5 
*	0 2 3 4 5 
*	0 0 3 4 5 
*	0 0 0 4 5 
*	0 0 0 0 5 
*
*
*/


class LowerUpperDiagonalMatrix{
	public static void lowerDiagonal(int[][] arr, int row, int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(i<j){
					System.out.print(0+" ");
				}else{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

	public static void upperDiagonal(int[][] arr, int row, int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(i>j){
					System.out.print(0+" ");
				}else{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		int[][] arr= {{1, 2, 3, 4, 5},
					  {1, 2, 3, 4, 5}, 
					  {1, 2, 3, 4, 5},
					  {1, 2, 3, 4, 5},
					  {1, 2, 3, 4, 5}};

		int row=5,col=5;

		System.out.println("Lower Diagonal");
		lowerDiagonal(arr, row, col);


		System.out.println("Upper Diagonal");
		upperDiagonal(arr, row, col);
	}
}