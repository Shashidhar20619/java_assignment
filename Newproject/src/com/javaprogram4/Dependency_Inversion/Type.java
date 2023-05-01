package com.javaprogram4.Dependency_Inversion;

public class Type {
	public static void main(String[] args) {
	    Calculator calculator = new Calculator();

	    // Use addition operation
	    calculator.setOperation(new Addition());
	    int result = calculator.calculate(2, 3);
	    System.out.println(result); 

	    // Use multiplication operation
	    calculator.setOperation(new Multiplication());
	    result = calculator.calculate(2, 3);
	    System.out.println(result); 
	}
}
