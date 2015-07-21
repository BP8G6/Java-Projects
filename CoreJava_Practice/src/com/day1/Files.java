package com.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {

	public static void main(String[] args) throws IOException {
		FileInputStream input=null;
		FileOutputStream output=null;
		try
		{
			input = new FileInputStream("F:\\BellInfo_Practice\\CoreJava_Practice\\src\\com\\day1\\test.txt");
			output = new FileOutputStream("F:\\BellInfo_Practice\\CoreJava_Practice\\src\\com\\day1\\test");
			int text;
			while((text =input.read())!=-1)
			{
				output.write(text);
			}
	}
						
		finally
		{
			if(input!=null)
			{input.close();}
			if(output!=null)
			{output.close();}
			
		}
		
	}

}
