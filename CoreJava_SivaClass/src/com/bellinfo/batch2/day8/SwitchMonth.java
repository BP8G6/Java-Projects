package com.bellinfo.batch2.day8;

import java.util.Scanner;

public class SwitchMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of month...!");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Feburary");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("March");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid Input, Enter Only Positive Integers");
			break;

		}
		switch (n) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("This in Winter Season");
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("This is Summer Season");
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("This is Rainy Season");
			break;
		default:
			System.out.println("Invalid Input, Enter Only Positive Integers");
			break;

		}
		
	}

}
