package core.java.assignment5;

import java.util.Scanner;

public class UserDefinedNumberException extends Exception {

	Scanner sc = new Scanner(System.in);
	
	UserDefinedNumberException(String CardNumber)
	{
		
				System.out.println("You Entered INCORRECT Card Number..!Please Try Again with 16 Digit Integer Number");
	}
	
	public String toString()
	{
		return "Please try again with Correct Details";
	}
}
