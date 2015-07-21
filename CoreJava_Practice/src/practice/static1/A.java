package practice.static1;

public class A {
	public static void main(String[] args)
	{
		A a = new A();
		//method1(); Cant directly accss because non- static method
		method2();
		a.method1();
		
		
	}
	
	
	public void method1()
	{
		System.out.println("This is a Non Static Method");
		main(null);
		method3();
	}
	
	public static void method2()
	{
		
	}

	protected static void method3()
	{
		
	}
}
