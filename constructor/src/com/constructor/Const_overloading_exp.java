package com.constructor;

import java.util.Scanner;

public class Const_overloading_exp {
	
	int id;
	
	String name;
	
	double salary;
	
	Const_overloading_exp(int id)
	{
		this.id=id;
		
		this.name=" unknown ";
		
		this.salary= 0.0;
	}
	
	Const_overloading_exp(int id,String name)
	{
		this.id=id;
		
		this.name=name;
		
		this.salary=0.0;
	}
	
	Const_overloading_exp(int id,String name,double salary)
	{
		this.id=id;
		
		this.name=name;
		
		this.salary=salary;
	}
	
	void display()
	{
		System.out.println(" ID : " + id);
		
		System.out.println(" NAME : " + name);
		
		System.out.println(" SALARY : " + salary);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" CHOOSE ANY ONE CONSTRUCTOR : ");
		
		System.out.println(" 1. ONLY ID ");
		
		System.out.println(" 2. ID AND NAME ");
		
		System.out.println(" 3. ID, NAME, AND SALARY ");
		
		int choice = sc.nextInt();
		
		sc.nextLine();
		
		Scanner sn = new Scanner(System.in);	// THIS SCANNER CLASS IS CREATING FOR GETTING THE NAME (STRING)       
		
		Const_overloading_exp obj;
		
		switch(choice)
		{
		
		case 1 :
			
			System.out.println(" Enter the ID : ");
			
			int id1 = sc.nextInt();
			
			obj=new Const_overloading_exp(id1);	// CREATING OBJECT FOR THE CLASS
			
			break;
			
		case 2 :
			
			System.out.println(" Enter the ID : ");
			
			int id2 = sc.nextInt();
			
			System.out.println(" Enter the NAME : ");
			
			String name1=sn.nextLine();
			
			obj=new Const_overloading_exp(id2,name1);
			
			break;
			
		case 3 :
			
			System.out.println(" Enter the ID : ");
			
			int id3 = sc.nextInt();
			
			System.out.println(" Enter the NAME : ");
			
			String name2=sn.nextLine();
			
			System.out.println(" Enter the SALARY : ");
			
			double salary = sc.nextDouble();
			
			obj=new Const_overloading_exp(id3,name2,salary);
			
			break;	
			
		default:
			
			System.out.println(" INVALID CHOICE ");
			
			obj=new Const_overloading_exp(0);
			
			break;	
		
		}
		
		
		obj.display();
		
		
		sc.close();
		
		sn.close();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
