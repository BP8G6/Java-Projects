package com.objectexample;

public class SampleObject {
	

	SampleObject(String text)
	{
	//System.out.println(text);	
	}

	public static void main(String[] args)
	{
		SampleClass s= new SampleClass();
		SampleObject x= s.doSomething();
		
	}
	
	
	
}


 class SampleClass{
	 
	 public static SampleObject doSomething()
		{System.out.println();
			return new SampleObject("hello");
		}
	
}