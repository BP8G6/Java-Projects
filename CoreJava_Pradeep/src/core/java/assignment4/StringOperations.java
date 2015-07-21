package core.java.assignment4;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class StringOperations {
	int count = 1, Lcount = 1,NLCount;
	String index = "J";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 //System.out.println("Enter the String........!");
		 //String s = sc.nextLine();
		 
		
		String s = "This is a Java Class";// In Bell Info Solutions";
		StringOperations SO = new StringOperations();

		SO.Words(s);
		SO.length(s);
		SO.indexOf(s);
		SO.replaceWord(s);
		SO.noOfChar(s);
		SO.reverseString(s);
		SO.reverseWords(s);
		SO.positionOF(s);
		SO.repetedLetterCount(s);		
		SO.wordReverse(s);
		SO.letterNotRepeated(s);
		SO.Duplicate(s);
	}

	public void Words(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
				count++;
			}
		}
		System.out.println("Number of Words in String are : " + count);
	}

	public void length(String s) {
		System.out.println("Length of String is : " + s.length());
	}

	public void noOfChar(String s) {
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				Lcount++;
			}
		}
		System.out.println("Number of Characters in String are : " + Lcount);
	}

	public void reverseWords(String s) {
		
		String[] splittedstring = s.split("\\s+");
		String rev = " ";

		for( int i=0;i<splittedstring.length;i++)
		{
		   rev=rev+" ";
		    
		 for(int k=splittedstring[i].length()-1;k>=0;k--){
		     
		     rev=rev+splittedstring[i].charAt(k);
		    
		 }

		    
		}
		System.out.println("\nReverse of Words in String is : "+rev);
		
		/*int k = 0;
		System.out.print("\nReverse of Words in String is :\t");
		for (int j = 0; j < s.length(); j++)
			if (s.charAt(j) == ' ') {

				for (int i = j; i >= k; i--) {
					System.out.print(s.charAt(i));
				}
				k = j;
			}*/
	}

	public void reverseString(String s) {
		System.out.print("Reverse of String is:\t");
		for (int i = s.length() - 1; i >= 0; i--) {
			
			System.out.print(s.charAt(i));
		}

	}

	public void replaceWord(String s) {
		System.out.println("Replacement of Word in String : "
				+ s.replace("Java", "SQL"));
	}

	public void positionOF(String s) {
		int pos = s.length()/2;
		System.out.println("Letter at the Center of the String is : "+s.charAt(pos));
	}

	public void indexOf(String s) {
		System.out.println("The Index of J in String is : " + s.indexOf('J'));
	}

	public void repetedLetterCount(String s) {
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				NLCount++;
			}
		}
		System.out.println("No. of times Letter A in String has Repeted : "+NLCount);
	}

	public void letterNotRepeated(String s) {
		int Flag=0;
		System.out.println("\nTheLetters Which are Not Repeated are:");
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)==c)
			{	
				Flag++;			
			}	
		//System.out.println(Flag);
		}
		if(Flag==1)
		{
			System.out.print(s.charAt(i)+"\t");
		}
		Flag=0;
		
		}
		
		
	}
	
	public void wordReverse(String s)
	{
		
        String input2[] = s.split(" ");
        //System.out.println(input2.length);
        StringBuffer[] temp = new StringBuffer[input2.length];
     System.out.print("Reveres of Words in String is : ");
       for(int i=0;i<input2.length;i++)
       {
    	  temp[i]=new StringBuffer(input2[i]);
       }
       
       for(int i=0;i<input2.length;i++)
       {
    	   System.out.print(temp[i].reverse());
       }
		
		
		
	}
	
	public void Duplicate(String s)
	{
		System.out.println("\nDuplicate Letters in String are : ");
		char[] charArray = null;// ={  }; 
		int Flag1=0;		
		String Array[];
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					Flag1++;
				}			
			
			}
			if(Flag1>1)
			{
				/*for(int h=0;h<s.length();h++)
				{
										
				}
				
				/*for(int h=0;h<s.length();h++)
				{
					for(int k=h+1;k<s.length()-1;k++)
					{
						if(charArray[h]!=charArray[k])
						{
							System.out.println(charArray[h]);
						}
					}
				}*/
				//System.out.println(l);
				System.out.print(s.charAt(i)+"\t");	
			}
				
			Flag1=0;
			
		}
		
		
	}
}

