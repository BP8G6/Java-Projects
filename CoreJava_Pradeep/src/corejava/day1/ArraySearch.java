package corejava.day1;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		int k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number to Search..!");
		int number=sc.nextInt();
		int Array[] = {250,320,620};
		for(int i=0;i<Array.length;i++)
		{
			if(Array[i]==number)
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
