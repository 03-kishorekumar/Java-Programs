package com.Polymorphism;

class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
	
	void DisplayBankDetails()
	{
		System.out.println(" Bank details are not available ");
	}
}

class Sbi extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
	
	void DisplayBankDetails()
	{
		System.out.println(" Bank : STATE BANK OF INDIA (SBI) ");
		
		System.out.println(" SBI Rate Of Interest : " + getRateOfInterest() + " % \n ");
	}
}

class Icici extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
	
	void DisplayBankDetails()
	{
		System.out.println(" Bank : ICICI ");
		
		System.out.println(" ICICI Rate Of Interest : " + getRateOfInterest() + " % \n ");
	}
}

class Axis extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}
	
	void DisplayBankDetails()
	{
		System.out.println(" Bank : AXIS ");
		
		System.out.println(" AXIS Rate Of Interest : " + getRateOfInterest() + " % \n ");
	}
}



public class Method_overriding {

	public static void main(String[] args) {
		
		Bank obj1= new Sbi();				// 	OR   Sbi obj1 = new Sbi();    
		
		Icici obj2 = new Icici();			// 	OR   Bank obj1 = new Icici();   
		
		Axis obj3 = new Axis();				// 	OR   Bank obj1 = new Axis();
		
		
		
		
		
		System.out.println(" Calling DisplayBankDetails() for Different Banks \n ");
		
		obj1.DisplayBankDetails();
		
		obj2.DisplayBankDetails();
		
		obj3.DisplayBankDetails();
		
		
		
		
		System.out.println(" getRateOfInterest for all Banks \n ");
		
		System.out.println(" SBI Rate Of Interest : " + obj1.getRateOfInterest() + " % \n ");
		
		System.out.println(" ICICI Rate Of Interest : " + obj2.getRateOfInterest() + " % \n ");
		
		System.out.println(" AXIS Rate Of Interest : " + obj3.getRateOfInterest() + " % \n ");
		
		
		
		
		
		Bank objj = new Bank();
		
		System.out.println(" Calling DisplayBankDetails() for Bank ");
		
		objj.DisplayBankDetails();
		
		System.out.println();
		
		System.out.println(" getRateOfInterest for Bank ");
		
		System.out.println(" Bank Rate Of Interest : " + objj.getRateOfInterest() + " % ");
		
		
		// TODO Auto-generated method stub

	}

}
