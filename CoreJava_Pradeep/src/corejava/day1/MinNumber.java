package corejava.day1;

import java.util.Scanner;

public class MinNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers..!");
		int numbers[] = new int[4];
		
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i] = sc.nextInt();
			//System.out.println(numbers[i]);
		}	
		System.out.println("Entered Numbers after Sorting are..!");
		for(int i=0; i<numbers.length;i++)
		{
			for (int j=i+1;j<=numbers.length-1;j++)
			{
				if(numbers[i]>numbers[j])
				{
					int temp = numbers[i];
					numbers[i]=numbers[j];
					numbers[j] = temp;
				}
			}
			System.out.print(numbers[i]+"\t");	
		}
		System.out.println("\nThe Minimum Number is:" +numbers[0]);
		

	}

}
