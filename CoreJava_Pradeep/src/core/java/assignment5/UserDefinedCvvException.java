package core.java.assignment5;

import java.util.Scanner;

public class UserDefinedCvvException extends Exception {

	UserDefinedCvvException(String cvv)
	{
			
		System.out.println("The CVV Number You Entered is Wrong...! Please try again with 3 digit CVV INTEGER Number");
	}
	
	public String toString()
	{
		return "Please try again with Correct Details";
	}
}
