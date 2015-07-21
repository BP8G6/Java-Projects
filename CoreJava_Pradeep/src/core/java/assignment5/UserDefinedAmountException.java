package core.java.assignment5;

import java.util.Scanner;

public class UserDefinedAmountException extends Exception {

	Scanner sc = new Scanner(System.in);
	UserDefinedAmountException(Double Amount)
	{
		System.out.println("You Have Insufficient Amount to Transfer..! Please Check your Balance and try Agian");
	}
	
	public String toString()
	{
		return "Please try again with Correct Details";
	}
}
