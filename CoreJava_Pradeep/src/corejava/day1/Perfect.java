package corejava.day1;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number....!");
		int number = sc.nextInt();
		int perfect=0;
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				perfect = perfect+i;
				//System.out.print(i);
			}			
		}
		if(perfect == number)
		{
			System.out.println("The Given Number "+number+" is a Perfect Number");
		}else
			System.out.println("The Given Number "+number+" is Not a Perfect Number");
	}

}
