package com.Interface;


interface show
{
	 void show();
}

interface print extends show
{
	void print();
}


class Ajhg implements print
{
	public void print()
	{
		System.out.println(" PRINT...... ");
	}
	
	public void show()
	{
		System.out.println(" SHOW....... ");
	}
}


public class Interface_inheritance {

	public static void main(String[] args) {
		
		Ajhg obj = new Ajhg();
		
		obj.print();
		
		obj.show();
		
		// TODO Auto-generated method stub

	}

}
