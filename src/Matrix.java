public class Matrix {

	public static void main(String[] args) {
		
		// Create two matrices
		int firstMatrix[][] = {{1,3,4},{2,4,3},{3,4,5}};
		int secondMatrix[][] = {{1,3,4},{2,4,3},{1,2,4}};
		
		// Create a matrix to store the sum of two matrices
		int thirdMatrix[][] = new int[3][3];
		
		// Add and print addition of 2 matrices
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				thirdMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
				System.out.print(thirdMatrix[i][j] + " ");
			}
		System.out.println();
		}
	}
}