package com.springexample.triangle;

public class Triangle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	
	public void draw()
	
	{	System.out.println("Returning Point Objects Value using Triangle Objects : ");
		System.out.println("PointA= ( " +getPointA().getX()+ "," + getPointA().getY() +" ) ");
		System.out.println("PointB= ( " +getPointB().getX()+ "," + getPointB().getY() +" ) ");
		System.out.println("PointC= ( " +getPointC().getX()+ "," + getPointC().getY() +" ) ");
		
		System.out.println("================================================================");
		System.out.println("Returning Trangle Objects Value : Because we are referring/ passing address : ");
		System.out.println("PointA= ( " +getPointA()+ "," + getPointA() +" ) ");
		System.out.println("PointB= ( " +getPointB()+ "," + getPointB()+" ) ");
		System.out.println("PointC= ( " +getPointC()+ "," + getPointC() +" ) ");
	}
	

}
