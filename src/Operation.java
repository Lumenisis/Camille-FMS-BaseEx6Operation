import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		
		// Scanner creation
		Scanner scan = new Scanner(System.in);
		
		// Operation choice
		System.out.println("Quel type d'opération souhaitez-vous réaliser ?");
		System.out.println("Addition - Soustraction - Multiplication - Division");
		System.out.println("Saisissez votre choix : add / sub / div / mul");
		String operationChoice = scan.nextLine();
		
		// Numbers choice
		System.out.println("Entrer un premier nombre entier :");
		int firstNumber = scan.nextInt();
		System.out.println("Entrer un second nombre entier :");
		int secondNumber = scan.nextInt();
		
		// Calculation
		switch(operationChoice)
        {
            case "add":
            	int resultAdd = firstNumber + secondNumber;
                System.out.println("Addition : " + firstNumber + " + " + secondNumber + " = " + resultAdd);
            break;
            case "sub":
            	int resultSub = firstNumber - secondNumber;
                System.out.println("Soustraction : " + firstNumber + " - " + secondNumber + " = " + resultSub);
            break;
            case "div":
            	float resultDiv = firstNumber / secondNumber;
                System.out.println("Division : " + firstNumber + " / " + secondNumber + " = " + resultDiv);
            break;
            case "mul":
            	int resultMul = firstNumber * secondNumber;
                System.out.println("Multiplication : " + firstNumber + " * " + secondNumber + " = " + resultMul);
            break;
        }
		
		// Closing the scanner
		scan.close();
	}
}