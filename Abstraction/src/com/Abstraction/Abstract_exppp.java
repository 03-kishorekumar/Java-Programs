package com.Abstraction;

abstract class Shape
{
	abstract void draw();
}

class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println(" RECTANGLE ");
	}
}

class Circle extends Shape
{
	public void draw()
	{
		System.out.println(" CIRCLE ");
	}
}



public class Abstract_exppp {

	public static void main(String[] args) {
		
		Shape obj = new Circle();
		
		obj.draw();
		
		Rectangle obj1 = new Rectangle();
		
		obj1.draw();
		
		
		
		// TODO Auto-generated method stub

	}

}
