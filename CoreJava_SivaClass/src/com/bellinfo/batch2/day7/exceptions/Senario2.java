package com.bellinfo.batch2.day7.exceptions;

import java.util.Scanner;

public class Senario2 {

	public static void main(String[] args) {
		boolean isZero = true;
		do {

			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("ENter N1");
				int n1 = sc.nextInt();
				System.out.println("Enter N2");
				int n2 = sc.nextInt();
				int n3 = n2 / n1;
				System.out.println("Result of Division is : " + n3);
				isZero=false;
			} catch (Exception e) {
				System.out.println("Please Enter Non Zero Value");
			}
		} while (isZero);
	}
}
