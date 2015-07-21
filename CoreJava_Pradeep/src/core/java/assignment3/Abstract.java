package core.java.assignment3;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childclass cc = new childclass();
		cc.normalMethod();
		cc.abstractMethod();
	}
	
}

abstract class Parentclass
{
	
	public void normalMethod()
	{
		System.out.println("This is the Noramla Method in the Abstarct Class");
	}
	abstract public void abstractMethod();
	
}

class childclass extends Parentclass
{

	
	public void abstractMethod() {
		System.out.println("Parent Class Abstract Method Implementation in Derived Class");
		
	}
	
}