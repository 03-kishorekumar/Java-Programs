package com.Interface;


interface printable
{
	void print();
}

interface showable
{
	void show();
}


class Ajax implements printable,showable
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


public class Multiple_interface {

	public static void main(String[] args) {
		
		Ajax obj = new Ajax();
		
		obj.print();
		
		obj.show();
		
		// TODO Auto-generated method stub

	}

}
