package core.java.assignment5;

import java.util.Calendar;
import java.util.Scanner;

public class UserDefinedDateException extends Exception {

	UserDefinedDateException(String Date)
	{
		
		System.out.println("The Date You Entered is Wrong/Expired..!Please try again with Correct date");
	}
	
	

	public String toString()
	{
		return "Please try again with Correct Details";
	}
}
