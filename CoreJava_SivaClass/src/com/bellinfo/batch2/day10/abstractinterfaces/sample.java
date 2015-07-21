package com.bellinfo.batch2.day10.abstractinterfaces;

public class sample {

	public static void main(String args[])
	{
		int numbers[]={-5, -2, -12, 7, 3, 15, 10};
		array(numbers);
	}
	
	public static void array(int[] numbers) {
        
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++){
            if(numbers.length -1==i)
               System.out.print(i+ ": " + numbers[i]);
             else 
               System.out.print(i + ": " + numbers[i] + ", ");          
        }
        System.out.print("]");
}
}
