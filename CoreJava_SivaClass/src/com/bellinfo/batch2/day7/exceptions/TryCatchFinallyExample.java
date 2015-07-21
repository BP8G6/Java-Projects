package com.bellinfo.batch2.day7.exceptions;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner; //CTRL+1 -- short cut

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter the Numbers N1...!");
			int n1 = sc.nextInt();
			System.out.println("Enter the Numbers N2...!");
			int n2 = sc.nextInt();
			int z =n1/n2;
			System.out.println("After Exception");
			//method1(n1, n2);

			System.out.println("Successfully Entered Values into Array");
		} catch (ArithmeticException e) {
			System.out
					.println("You Entered Zero Value For N1 Which is Not Allowed");			
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.println("Your Program need to be Corrected. You are Entering 3 more than the size intialized");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Only Integer Values");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Temporary Not Available");
		}
		
		finally {
			System.out.println("I Will Exectute All The Time");
		}
		// System.out.println("Hi this Ponnam Balakrishna");

	}

	public static int method1(int a, int b) throws InputMismatchException,ArrayIndexOutOfBoundsException

	{
		method3(a,b);
		
		int n3 = b / a;
		System.out.println("Result of Two Numbers is : " + n3);
		
		return n3;
	}

	private static void method3(int a, int b) throws ArrayIndexOutOfBoundsException {
		
		int[] inputArray = new int[2];
		inputArray[0] = a;
		inputArray[1] = b;
		inputArray[3] = a;
	}
}
