/* Program to check matrix is symmetric or not */

class CheckSymmetricMatrix{
	public static Boolean isSymmetric(int[][] matrix, int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(matrix[i][j] != matrix[j][i])
					return false;
			}
		}
		return true;
	}


	public static void main(String[] args){
		int[][] matrix={{1,2,3},{2,1,4},{3,4,3}};
		if(isSymmetric(matrix,3)){
			System.out.println("Matrix is Symmetric");
		} else{
			System.out.println("Matrix is Not Symmetric");

		}
	}
}