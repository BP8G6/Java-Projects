package com.bellinfo.batch2.day3;

public class VariableAccessSpecifiersValidation {
	
	public int publicvar=10;
	private int privatevar=10;
	protected int protectedvar=10;
	int defaultvar=10;
	
	
	static int staticvar=10;
	final int finalvar=10;
	
	public static int publicstaticvar=10;
	private static int privatestaticvar=10;
	protected static int protectedstaticvar=10;
	static int defaultstaticvar=10;
	
	public final int publicfinalvar=10;
	private final int privatefinalvar=10;
	protected final int protectedfinalvar=10;
	final int defaultfinalvar=10;
	
	public static final int publicstaticfinalvar=10;
	private static final int privatestaticfinalvar=10;
	protected static final int protectedstaticfinalvar=10;
	static final int defaultstaticfinalvar=10;
	
	public static void main(String[] args)
	{
		//Only Final and Default can be allowed biablesecause these are local var
		
		//public int publicvar=10;
		//private int privatevar=10;
		//protected int protectedvar=10;
		int defaultvar=10;		
		//static int staticvar=10;
		final int finalvar=10;
		finalclass obj=new finalclass();
		obj.x=10;
		
	}
	
	public void publicmethod(){}
	private void privatemethod(){}
	protected void protectedmethod(){}
	void defaultmethod(){}
	
	public static void publicstaticmethod(){}
	private static void privatestaticmethod(){}
	protected static void protectedstaticmethod(){}
	void defaultstaticmethod(){}
	
	
	public final void publicfinalmethod(){}
	private final void privatefinalmethod(){}
	protected final void protectedfinalmethod(){}
	final void defaultfinalmethod(){}
	
	
	public static final void publicstaticfinalmethod(){}
	private static final void privatestaticfinalmethod(){}
	protected static final void protectedstaticfinalmethod(){}
	static final void defaultstaticfinalmethod(){}
		
	}

class Defaultclass{}
final class finalclass{
	int x=12;
}


//Cannot write Protected Class
//protected class protectedclass{}

//Cannot write privateclass
//private class privateclass{}

//Cannot write static class
//static class staticclass{}


