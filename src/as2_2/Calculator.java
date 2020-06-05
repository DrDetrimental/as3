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
	
	/**
	 * The main method of the program.
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean loop = true;
		
		// Gets number/operand inputs from the user.
		double number1 = chooseNumber();
		double number2;
		int operand;
		double answer = 0.0;
		
		while (loop) {
			
			System.out.println("Getting operand");
			operand = chooseOperand();
			System.out.println("Getting number 2");
			number2 = chooseNumber();
			
			// Switch statement calculates based on operand choice & outputs answer.
			switch (operand) {
			
			case 1:
				
				answer = number1 + number2;
				System.out.println(number1 + " + " + number2 + " = " + answer);
				break;
				
			case 2:

				answer = number1 - number2;
				System.out.println(number1 + " - " + number2 + " = " + answer);
				break;
				
			case 3:
				
				answer = number1 * number2;
				System.out.println(number1 + " x " + number2 + " = " + answer);
				break;
				
			case 4:
				
				answer = number1 / number2;
				System.out.println(number1 + " / " + number2 + " = " + answer);
				
			}
			
			if (clearMemory()) {
				System.out.println("Getting number 1");
				number1 = chooseNumber();
				
			} else {
				
				number1 = answer;
				
			}
		}	
	}
	
	/**
	 * Method to get user input on one of the numbers to calculate.
	 * @return numberInput
	 */
	private static double chooseNumber() {
		
		double numberInput = 0.0;
		
		// While loop for number input.
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
		
		int operandChoice = 0;
		
		// While loop for operand input.
		while (!inputIsValid) {
			
			// Prompt user for input.
			System.out.println("Please choose your operand:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
			
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
				
				System.out.println("Invalid choice. Try again.");
				
			}	
		}
		
		// Reset inputIsValid for the next user choice & return user input
		inputIsValid = false;
		return operandChoice;
	}
	
	/**
	 * Method to get user input on clearing memory or not.
	 * @return boolean
	 */
	private static boolean clearMemory() {
		
		int clearChoice = 0;
		
		// While loop for memory clear input.
		while (!inputIsValid) {
			
			// Prompt user for input.
			System.out.println("Do you want to clear the memory or continue calculations with your answer?\n1. Clear memory\n2. Continue with answer");
			
			try {
				
				clearChoice = scnr.nextInt();
				
			} catch (Exception TypeMismatchException) {
				
				System.out.println("Your input is invalid. It may only be a whole number. Try again.");
				scnr.nextLine();
				
			}
			
			// Determines if the int entered is a valid choice.
			if (clearChoice > 0 && clearChoice < 3) {
				
				inputIsValid = true;
				
			} else {
				
				System.out.println("Invalid choice. Try again.");
				
			}
		}
		
		// Reset inputIsValid for the next user choice & return user input
		inputIsValid = false;
		if (clearChoice == 1) {
			System.out.println("Returning true");
			return true;
		} else {
			System.out.println("Returning false");
			return false;
		}
	}
}
