package com.bellinfo.batch2.day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Number of Inputs");
	
		try
		{	
			int n = sc.nextInt();
			int[] array = new int[n];
			System.out.println("Enter The Numbers");			
			for(int i=0;i<array.length;i++)
			{
				array[i] =sc.nextInt();
			}			
			System.out.println("The Entered Numbers are:");
			for(int i=0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}
			System.out.println("Reverese Of Numbers are:");
			for(int i= array.length-1;i>=0;i--)
			{
				System.out.print("\t"+array[i]);
			}

		}
		catch(InputMismatchException e)
		{
			System.out.println("No Strings..,Enter Only Positive Integers");
		}
		catch(Exception e)
		{
			System.out.println("No Negative Numbers...Enter Only Positive Integers..!");
		}
		
	}

}
