package corejava.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number....!");
		int number = sc.nextInt();
		for(int i=number;i>0;i--)
		{
			fact = fact*i;
		}
		System.out.println("The Factorial of given number is: "+fact);
	}
}
