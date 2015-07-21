package com.day1;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find the Factors..!");
		int number = sc.nextInt();
		System.out.println("The factors of the number "+number+" are:\n");
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.print(i+"\t");
			}
		}
	}

}
