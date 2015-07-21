package com.day1;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for what Multiplcation table to Print..!");
		int number =sc.nextInt();
		for(int i=0;i<=10;i++)
		{
			System.out.println(number+"*"+ i + "=" +number*i);
		}

	}

}
