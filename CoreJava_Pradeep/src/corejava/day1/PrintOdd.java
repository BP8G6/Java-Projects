package corejava.day1;

import java.util.Scanner;

public class PrintOdd {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter till what number to print the odd numbers");
		int number = sc.nextInt();
		System.out.println("Odd numbers are...!");
		for(int i=1;i<=number;i++)
		{
			if(i%2!=0 )
			{
			System.out.print(i+"\t");	
			}
		}

	}

}
