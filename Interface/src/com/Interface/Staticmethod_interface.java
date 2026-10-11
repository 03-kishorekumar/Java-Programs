package com.Interface;

interface inter
{
	void draw();
	
	static int cube(int x)
	{
		return x*x*x;
	}
	
}




class Circ implements inter
{
	public void draw()
	{
		System.out.println(" RECTANGLE ");
	}
}

public class Staticmethod_interface {

	public static void main(String[] args) {
		
		Circ obj = new Circ();
		
		obj.draw();
		
		System.out.println(" STATIC METHOD : \n "+inter.cube(3));
		
		
		// TODO Auto-generated method stub

	}

}
