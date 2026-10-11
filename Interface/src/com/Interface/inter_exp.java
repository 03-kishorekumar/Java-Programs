package com.Interface;



interface Method
{
	void a();
	
	void b();
	
	void c();
	
	void d();
}


abstract class Axx implements Method
{
	public void c()
	{
		System.out.println(" C METHOD ");
	}
}

class Bxx extends Axx
{
	public void a()
	{
		System.out.println(" A METHOD ");
	}
	
	public void b()
	{
		System.out.println(" B METHOD ");
	}
	
	public void d()
	{
		System.out.println(" D METHOD ");
	}
}



public class inter_exp {

	public static void main(String[] args) {
		
		Method obj = new Bxx();
		
		obj.a();
		
		obj.b();
		
		obj.c();
		
		obj.d();
		
		// TODO Auto-generated method stub

	}

}
