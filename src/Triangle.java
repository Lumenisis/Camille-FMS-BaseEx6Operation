public class Triangle {

	public static void main(String[] args) {
		
		// Number of rows for each triangle
        int rows = 5;
        
        // First triangle
        System.out.println("\n---1---\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println("");
        }
        
        // Second triangle
        System.out.println("\n---2---\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
        System.out.println("");
        }
	}
}