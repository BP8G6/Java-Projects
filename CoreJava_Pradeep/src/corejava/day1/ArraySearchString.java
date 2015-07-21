package corejava.day1;

import java.util.Scanner;

public class ArraySearchString {

	public static void main(String[] args) {
		int k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Search");
		String number = sc.nextLine();
		String[] Array= {"320","520","620","420","120"};
		for(int i=0;i<Array.length;i++)			
		{
			if(Array[i].equals(number))
			{
				k=1;
				System.out.println("The Number is in Index Number : "+i);
				break;
			}
		}
		if(k==0)
		{
			System.out.println("The Number is Not in the Array");
		}

	}

}
