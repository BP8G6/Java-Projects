package core.java.assignment5;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;


public class UserDefinedException  {
	public static final int NumLength =16;
	public static final int cvvLength=3;
	
	public static void main(String[] args){		
		
		try
		{
			exceptionMethod();
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter Only Integers");
		}
		catch(Exception e)
		{
			System.out.println("You Have Entered Wrong Details..! Please Try Agian");
		}
		
	}

	
	public static void exceptionMethod() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Card Number");
		String number = sc.nextLine();
		
		if(number.length()==NumLength && number.matches("[0-9]+"))
		{	
		System.out.println("Enter the CVV Number");
		String cvvnum = sc.next();		
			if(cvvnum.length()==cvvLength && cvvnum.matches("[0-9]+"))
			{
				System.out.println("Enter The Expiration Date...! The Date should be in MM/YY Format");
				String Date = sc.next();
				
				String array[] = Date.split("/");
				String mnt =array[0];
				String yr =array[1];				
				int Month = Integer.parseInt(mnt);
				int Year = Integer.parseInt(yr);
				int Currentyear = Calendar.getInstance().get(Calendar.YEAR)% 100;				
				if(array.length==2)
				{
					if(Month>0 && Month <=12  && Year >=Currentyear )
					{
						System.out.println("Enter the Amount to Transfer...!");
						Double amt = sc.nextDouble();
						
						
						if(amt<5000 && number.matches("[0-9]+"))
						{
							System.out.println("You Have Transferred your Amount successfully");							
						}
						else
						{
							try {
								throw new UserDefinedAmountException(amt);
							} catch (UserDefinedAmountException e) {								
								//e.printStackTrace();
							}
							
						}
					}
					
					else
					{
						try {
							throw new UserDefinedDateException(Date);
						} catch (UserDefinedDateException e) {
							//e.printStackTrace();
						}
					}
			}
				else
				{
					try {
						throw new UserDefinedDateException(Date);
					} catch (UserDefinedDateException e) {
						//e.printStackTrace();
					}
				}
			}
			else
			{
				try {
					throw new UserDefinedCvvException(cvvnum);
				} catch (UserDefinedCvvException e) {
					//e.printStackTrace();
				}
			}
			
		}
		else
		{
			try {
				throw new UserDefinedNumberException(number);
			} catch (UserDefinedNumberException e) {
				//e.printStackTrace();
			}
		}
	
}
}
