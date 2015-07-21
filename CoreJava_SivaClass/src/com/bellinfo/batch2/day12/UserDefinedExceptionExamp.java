package com.bellinfo.batch2.day12;

import java.util.Scanner;

public class UserDefinedExceptionExamp extends Exception {

	UserDefinedExceptionExamp()
	{
		System.out.println("Invalid Card Number");
	}
	
	UserDefinedExceptionExamp(String CardNo)
	{
		System.out.println("Invalid Card Number: "+CardNo);
	}
	
	public String toString()
	{
		return "Please try again with Correct Details";
	}
}


class ExecUserDefined
{
	public static void main(String args[]) 
	{
		//UserDefinedException UDE = new UserDefinedException();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Credit Card Number");
		String CCNO = sc.nextLine();
		cardMethod(CCNO);
	}
	
	public static String cardMethod(String CCNO)
	{
	
		if(CCNO.length()==16)
		{
			System.out.println("You Entered Correct Details You Transaction will be Processed");
		} else
			//throw new UserDefinedExceptionExamp(CCNO);
			try {
				throw new UserDefinedExceptionExamp(CCNO);
			} catch (UserDefinedExceptionExamp e) {
				System.out.println(e.toString());
			}
		
		return " ";
	}
}