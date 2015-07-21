package com.bellinfo.batch2.pack1;

public class A {

	public static void publicmthd()
	{
		System.out.println("Public accessible anywhere");
	}
	
	 static void defaultmthd()
	{
		System.out.println("Default within the package");
	}
	
	protected static void Protectedmthd()
	{
		System.out.println("Protected is accesible within the package and extends outside the package");
	}
	
	private void privatemthd()
	{
		System.out.println("private");
	}
}
