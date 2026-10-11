package com.Interface;


interface dha
{
	void draw();
	
	default void msg()
	{
		System.out.println(" DEFAULT ");
	}
}


class Rec implements dha
{
	public void draw()
	{
		System.out.println(" RECTANGLE ");
	}
}


public class Defaultmethod_Interface {

	public static void main(String[] args) {
		
		dha obj = new Rec();
		
		obj.draw();
		
		obj.msg();
		
		// TODO Auto-generated method stub

	}

}
