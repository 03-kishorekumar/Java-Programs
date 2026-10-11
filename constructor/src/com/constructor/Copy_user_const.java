package com.constructor;


import java.util.Scanner;

public class Copy_user_const {
	
	int id;
	
	String name;
	
	Copy_user_const()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the ID : ");
		
		id=sc.nextInt();
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println(" Enter the name : ");
		
		name=sn.nextLine();
		
		sc.close();
		
		sn.close();
		
	}
	
	Copy_user_const(Copy_user_const c)
	{
		id=c.id;
		
		name=c.name;
	}
	
	void Display()
	{
		System.out.println(" ID : " + id);
		
		System.out.println(" NAME : " + name);
	}
	

	public static void main(String[] args) {
		
		
		Copy_user_const obj=new Copy_user_const();
		
		Copy_user_const obj1=new Copy_user_const(obj);
		
		obj.Display();
		
		obj1.Display();
		
		// TODO Auto-generated method stub

	}

}
