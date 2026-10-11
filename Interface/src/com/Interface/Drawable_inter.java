package com.Interface;

interface Drawable
{
	void draw();
}

class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println(" RECTANGLE ");
	}
}

class Circle implements Drawable
{
	public void draw()
	{
		System.out.println(" CIRCLE ");
	}
}


public class Drawable_inter {

	public static void main(String[] args) {
		
		Drawable obj;
		
		obj = new Circle();
		
		obj.draw();
		
		obj=new Rectangle();
		
		obj.draw();
		
		
		// TODO Auto-generated method stub

	}

}
