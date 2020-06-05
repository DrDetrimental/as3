package as2_2;

import java.util.Scanner;
/**
 * 
 * @author Jordan
 * @version 1.0
 */
public class Calculator {
	
	static Scanner scnr = new Scanner(System.in);

	static boolean inputIsValid = false;
	static double numberInput = 0.0;
	static int operandChoice = 0;
	
	/**
	 * The main method of the program.
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Gets number/operand inputs from the user.
		double number1 = chooseNumber();
		int operand = chooseOperand();
		double number2 = chooseNumber();
		
		// Switch statement calculates based on operand choice & outputs answer.
		switch (operand) {
		
		case 1:
			
			System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
			
		case 2:

			System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
			
		case 3:
			
		case 4:
			
			
		}	
	}
	
	/**
	 * Method to get user input on one of the numbers to calculate.
	 * @return numberInput
	 */
	private static double chooseNumber() {
		
		// While loop for first number input.
		while (!inputIsValid) {
					
			// Prompt user for input.
			System.out.println("Please enter your number:");
					
			// Try to store user input as double; output error message if unsuccessful and ask user to try again.
			try {
						
				numberInput = scnr.nextDouble();
				inputIsValid = true;
						
			} catch (Exception TypeMismatchException) {
						
				System.out.println("Your input is invalid. It may only be a number. Try again.");
				scnr.nextLine();
						
			}
		}
		
		// Reset inputIsValid for the next user choice & return user input
		inputIsValid = false;
		return numberInput;
	}
	
	/**
	 * Method to get user input on the chosen operand.
	 * @return operandChoice
	 */
	private static int chooseOperand() {
		
		while (!inputIsValid) {
			
			// Prompt user for input.
			System.out.println("Please choose your operand:\n1. Addition\n2. Subtraction\n");
			
			// Try to store user input as int; output error message if unsuccessful and ask user to try again.
			try {
				
				operandChoice = scnr.nextInt();
				
			} catch (Exception TypeMismatchException) {
				
				System.out.println("Your input is invalid. It may only be a whole number. Try again.");
				scnr.nextLine();
				
			}
			
			// Determines if the int entered is a valid choice.
			if (operandChoice > 0 && operandChoice < 5) {
				
				inputIsValid = true;
				
			} else {
				
				System.out.println("Invalid operand input. Try again.");
				
			}	
		}
		
		// Reset inputIsValid for the next user choice & return user input
		inputIsValid = false;
		return operandChoice;
	}
}
