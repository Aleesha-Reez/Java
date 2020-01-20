
public class MatrixMultiplication {
	
	

	

		public static void main(String[] args) {
			
			
			int[][] A = { { 1, 0, 0 }, { -1, 0, 3 } };
			int[][] B = { { 7, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };
			
			int[][] result = multiply(A, B);
			
			for (int i = 0; i < result.length; i++) {
				
				for (int j = 0; j < result[0].length; j++) {
					
					System.out.print(" " + result[i][j]);
				}
				
				System.out.println();
			}

		}

		public static int[][] multiply(int[][] A, int[][] B) {
			
			int[][] output = new int[A.length][B[0].length];
			
			int m = A.length;
			int n = A[0].length;
			int k = B[0].length;
			
			for (int i = 0; i < m; i++) {
				
				for (int j = 0; j < n; j++) {
					
					if (A[i][j] != 0) {
						
						for (int p = 0; p < k; p++) {
							
							output[i][j] += A[i][j] * B[j][p];
						}
					}
				}
			}
			return output;
		}

}
