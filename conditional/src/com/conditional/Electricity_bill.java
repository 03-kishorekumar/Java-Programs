package com.conditional;


import java.util.Scanner;


public class Electricity_bill {

	public static void main(String[] args) {
		
		int units;
		
		double billamount;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the units for electricity bill : ");
		
		units=sc.nextInt();
		
		if(units<100)
		{
			billamount=(units * 1.20);
			System.out.println(" The billAmount for " + units + " is : " + billamount);
		}
		else if(units<300)
		{
			billamount=100*1.20 + (units-200)*2;
			System.out.println(" The billAmount for " + units + " is : " + billamount);		
		}
		else if(units > 300)
		{
			billamount=100*1.20 + 200*2 + (units-300)*3;
			System.out.println(" The billAmount for " + units + " is : " + billamount);		
		}
		else 
		{
			System.out.println(" INVALID UNITS!... ");
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
