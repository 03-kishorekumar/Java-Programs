package com.constructor;

import java.util.Scanner;


public class Copy_const_getby_user {
	
	int id;
	
	String name;
	
	Copy_const_getby_user(int i,String n)
	{
		id=i;
		
		name =n;
	}
	
	Copy_const_getby_user(Copy_const_getby_user c)
	{
		id = c.id;
		
		name = c.name;
	}
	
	void display()
	{
		System.out.println(" ID : " + id);
		
		System.out.println(" NAME : " + name);
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the ID : ");
		
		int id=sc.nextInt();
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println(" Enter the NAME : ");
		
		String name=sn.nextLine();
		
		Copy_const_getby_user obj=new Copy_const_getby_user(id,name);
		
		Copy_const_getby_user obj1=new Copy_const_getby_user(obj);
		
		obj.display();
		
		obj1.display();
		
		sc.close();
		
		sn.close();
		// TODO Auto-generated method stub

	}

}
