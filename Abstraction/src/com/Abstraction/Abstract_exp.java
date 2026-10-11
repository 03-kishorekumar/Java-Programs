package com.Abstraction;

abstract class Bank
{
	abstract int getRateofinterest();
}


class Sbi extends Bank
{
	public int getRateofinterest()
	{
		return 9;
	}
}


class Idbi extends Bank
{
	public int getRateofinterest()
	{
		return 10;
	}
}


public class Abstract_exp {

	public static void main(String[] args) {
		
		Bank obj;  
		
		obj=new Idbi();
		
		System.out.println(" IDBI : " + obj.getRateofinterest() + " % ");
		
		obj = new Sbi();
		
		System.out.println(" SBI : " + obj.getRateofinterest() + " % ");
		// TODO Auto-generated method stub

	}

}
