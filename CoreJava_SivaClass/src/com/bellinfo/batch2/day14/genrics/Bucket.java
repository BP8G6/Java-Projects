package com.bellinfo.batch2.day14.genrics;

public class Bucket {

	public static void main(String[] args) {
	

		GenericExample<Integer> ge = new GenericExample<Integer>();
		ge.setA(10);
		System.out.println(ge.getA());
		
		GenericExample<String> g = new GenericExample<>();
		g.setA("10");
		System.out.println(g.getA());
	}

}

class GenericExample<T> {
	
	private T a;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	
}
