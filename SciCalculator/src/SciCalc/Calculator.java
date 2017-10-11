package SciCalc;

import java.util.Scanner; //Scanner import
import java.lang.Math;

public class Calculator {

	private static Scanner userInput;

	public static void main(String[] args) {
		
		 Scanner userInput = new Scanner(System.in);
		
		//User input
		System.out.println("Welcome to my scientific calculator");
		System.out.println("Please enter your first value: ");
		double x = userInput.nextDouble();
		System.out.println("Please enter your second value: ");
		double y = userInput.nextDouble();
		
		//Close scanner
		userInput.close();
		
		//Computation
		double sum = x + y;
		double sub = x - y;
		double multiplication = x * y;
		double division = x / y;
		double mod = x % y;
		
		//Print out the result
		System.out.println("Results are as follows:");
		System.out.printf("Sum = %f\n", sum);
		System.out.printf("Sub = %f\n", sub);
		System.out.printf("Product = %f\n", multiplication);
		System.out.printf("Division = %f\n", division);
		System.out.printf("Remainder = %f\n",mod);
		System.out.printf("Log of x (Base 10) = %f\n", Math.log10(x));
		System.out.printf("Log of x (Base E) = %f\n", Math.E*x);
		System.out.printf("Sin of x = %f\n", Math.sin(x));
		System.out.printf("Cos of x = %f\n", Math.cos(x));
		System.out.printf("Tan of x = %f\n", Math.tan(x));	

	}

}
