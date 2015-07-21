package corejava.day1;

import java.util.Scanner;

public class Palintrom {

	public static void main(String[] args) {
		int palintrom=0;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the Number...!");
		int number = sc.nextInt();
		int num = number;
		while(number>0)
		{
			palintrom = palintrom*10;
			palintrom = palintrom+number%10;
			number=number/10;			
		}
		if(num==palintrom)
		{
			System.out.println("The Given Number "+num+" is palindrome");
		}
		else
			System.out.println("The Given Number "+num+" is not palindrome");
	}

}
