package com.constructor;

import java.util.Scanner;

public class Copy_without_another_const {
	
	int id;
	
	String name;
	
	Copy_without_another_const(int i,String n)
	{
		id=i;
		
		name=n;
	}
	
	Copy_without_another_const()
	{
		
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
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println(" Enter the NAME : ");
		
		String name = sn.nextLine();
		
		Copy_without_another_const obj=new Copy_without_another_const(id,name);
		
		Copy_without_another_const obj1=new Copy_without_another_const();
		
		obj1.id=obj.id;
		
		obj1.name=obj.name;
		
		obj.display();
		
		obj1.display();
		
		sc.close();
		
		sn.close();
		// TODO Auto-generated method stub

	}

}
