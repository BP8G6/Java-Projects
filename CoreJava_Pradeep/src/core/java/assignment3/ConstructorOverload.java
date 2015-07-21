package core.java.assignment3;

public class ConstructorOverload {

	public static void main(String[] args) {		

		Derivedclass d =new Derivedclass();
		System.out.println("===============================================================");
		Derivedclass dc = new Derivedclass(10,20);
//Object is Created, it calls default constructor in Derived Class and Excutes super method implicitly
//if there exists parameter constructor in base class then need to write constructor 
		//in derived class and then call super(arg,arg)		
	}

}

class Baseclass
{
	
	Baseclass()
	{
		System.out.println("Base Class Default Constructor");
	}
	
	Baseclass(int a,int b)
	{
		System.out.println("IN Base Class argumented construtor");
		System.out.println("X= "+a+"\tY="+b);
	}
}

class Derivedclass extends Baseclass
{
	Derivedclass()
	{
		
		System.out.println("Derived Class Default Constructor");
	}
		
	Derivedclass(int x,int y)
	{
		super(x,y);
		//super(10,20);
		System.out.println("Derived Class Argument Constructor");
		
	}
}