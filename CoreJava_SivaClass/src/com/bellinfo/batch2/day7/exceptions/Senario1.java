package com.bellinfo.batch2.day7.exceptions;

public class Senario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}



private static void method1(){
	System.out.println("Inside Method1");
	method2();
}

private static void method2()
{
	System.out.println("Inside Method2");
	method1(); //Stack Over flow error only way to solve is  ---Break the cyclic loop
}
}
