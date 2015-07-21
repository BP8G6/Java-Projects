package com.day1;

import java.util.Scanner;

public class MinimunNumber {
	
	
	
       public static void main(String[] args)
     {
           int[] a= new int[4];
           
           Scanner sc1=new Scanner(System.in);
           System.out.println("enter the integers");
            
           for(int i=0;i<a.length;i++){
             a[i] = sc1.nextInt();
            }
           
           for(int i=0; i<a.length;i++)
            {
                for (int j=i+1;j<=a.length-1;j++)
                {
                    if(a[i]>a[j])
                    {
                        int temp = a[i];
                        a[i]=a[j];
                        a[j] = temp;
                    }
                }
            }

           for( int i=0;i<a.length;i++){
                System.out.println(a[i]);
                }
        
    
    }
    }

