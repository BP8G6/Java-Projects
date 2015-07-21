package corejava.day1;

import java.util.Scanner;

public class ReverseNumberString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse....!");
		String number = sc.next();
		System.out.print("Reverse of a Number is : ");
		for (int i = number.length() - 1; i >= 0; i--) {
			System.out.print(number.charAt(i));
		}

	}

}
