package com.Interface;

interface Meth
{
	float RateofInterest();
}

class Sbi implements Meth
{
	public float RateofInterest()
	{
		System.out.println(" SBI ");
		
		return 9;
	}
}

class Icici implements Meth
{
	public float RateofInterest()
	{
		System.out.println(" ICICI ");
		
		return 10;
	}
}



public class Interface_example {

	public static void main(String[] args) {
		
		Meth obj = new Sbi();
		
		System.out.println(" SBI RATEOFINTEREST : " + obj.RateofInterest() + " %");
		
		Meth obj1 = new Icici();
		
		System.out.println(" ICICI RATEOFINTEREST : " + obj1.RateofInterest() + " %");
		
		// TODO Auto-generated method stub

	}

}
