package com.bellinfo.batch2.day7.exceptions;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Card Number");
		String NO = sc.nextLine();
		try {
			WrongException WE = new WrongException(NO);
			WE.toString();
		} catch (Exception e) {
			System.out.println("User Defined Exception");
		}
	}

}

class WrongException extends Exception {
	String CardNo;

	WrongException(String CardNo) {
		this.CardNo = CardNo;
	}

	public String toString() {
		System.out.println("Card Number is : " + CardNo);
		return CardNo;

	}

}
