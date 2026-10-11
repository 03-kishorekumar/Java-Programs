package com.constructor;

import java.util.Scanner;

public class Param_const {
	
	int id;
	
	String name;
	
	Param_const(int i,String n)
	{
		id=i;
		
		name=n;
		
		System.out.println(" ID : " + id);
		
		System.out.println(" NAME : " + name);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the 1st ID : ");
		
		int id1 = sc.nextInt();
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println(" Enter the 1st NAME : ");
		
		String name1 = sn.nextLine();
		
		System.out.println();
		
		System.out.println(" Enter the 2nd ID : ");
		
		int id2 = sc.nextInt();
		
		System.out.println(" Enter the 2nd NAME : ");
		
		String name2 = sn.nextLine();
		
		Param_const obj = new Param_const(id1,name1);
		
		Param_const obj1 = new Param_const(id2,name2);
		
		sc.close();
		
		sn.close();
		
		// TODO Auto-generated method stub

	}

}
