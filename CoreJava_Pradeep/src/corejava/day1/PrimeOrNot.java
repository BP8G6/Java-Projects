package corejava.day1;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number..!");
		int number = sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		if(count>2)
		{
			System.out.println("The given number is not a prime number");			
		}
		else
			System.out.println("The given number is a prime number");
	}

}
