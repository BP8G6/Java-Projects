package corejava.day1;

import java.util.Scanner;
import java.math.*;

public class Amstrong {

	public static void main(String[] args) {
		int amstrong =0;
		double input=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number....!");
		double number = sc.nextInt();
		int num = (int)number;
		double length =(int) Math.log10(number) + 1;// (int)String.valueOf(number).length();
		while(number>0)
		{
			input =(int)number%10;
			amstrong = amstrong+ (int)Math.pow(input,length); 
			number = number/10;
		}
		if(amstrong==num)
		System.out.println("The given number "+num +" is amstrong");
		else
			System.out.println("The given number "+num +" is not amstrong");	
		//System.out.println(length);		
	}

}
