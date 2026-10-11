package com.constructor;

import java.util.Scanner;

class parameter2 {
	
	int id;
	
	String name;
	
	parameter2()	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the id : ");
		
		int id=sc.nextInt();
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println(" Enter the name : ");
		
		String name = sn.nextLine();
		
		System.out.println(" ID  : " + id );
		
		System.out.println(" NAME : " + name);
		
	}

	public static void main(String[] args) {
		
		parameter2 obj = new parameter2();
		
		parameter2 obj1 = new parameter2();
		
		
		// TODO Auto-generated method stub
		

	}

}
