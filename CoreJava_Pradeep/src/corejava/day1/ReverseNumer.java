package corejava.day1;

import java.util.Scanner;

public class ReverseNumer {

	public static void main(String[] args) {
		int reverse =0;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse....!");
		int number = sc.nextInt();
		int store =number;
		while(number>0)
		{
			reverse = reverse*10;
			reverse = reverse+number%10;
			number = number/10;
		}
		System.out.println("The reverse of a number "+store +"is: " +reverse);
	}

}
