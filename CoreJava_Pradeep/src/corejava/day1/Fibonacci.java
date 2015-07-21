package corejava.day1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for Fibonacci series....!");
		int number =sc.nextInt();
		int c=0;
		int a=0,b=1;
		System.out.println("The Fibonacci Series......");
		System.out.print(a+","+b);
		for(int i=1;i<=number;i++)
		{
			c= a+b;
			a=b;
			b=c;
			System.out.print(","+c);
		}

	}

}
