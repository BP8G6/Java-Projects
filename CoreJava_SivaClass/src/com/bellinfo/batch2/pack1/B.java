package com.bellinfo.batch2.pack1;

public class B {

	public static void main(String[] args)
	{
		A objA = new A();
		objA.defaultmthd();
		objA.Protectedmthd();
	//	objA.privatemthd(); Cant Acees Private Methods
		objA.publicmthd();
	}
}
