package com.bellinfo.batch2.day12;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args)  throws Exception  {
		ExceptionEx Exobj = new ExceptionEx();
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter The First number");
		int n1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int n2 = sc.nextInt();
		int result ;
		Integer[] Array = new Integer[1];

		
		try
		{Exobj.method1(n1,n2);
			result = n2/n1;
			System.out.println("Division of Two Numbers is : "+result);
			Array[2]=result;
			
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Increase The Size of Array Cant Insert Into Array");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number Cannot Divide By Zero");
		}

		finally
		{
		System.out.println("Closed DB Connection....!");	
		}
	}

	
	public void method1(int n1,int n2) throws ArithmeticException
	{
		System.out.println("Method1 Implementation..........!");
		
		int result = n2/n1;
		System.out.println("Result in Method1 : "+result);
		}
}
