package com.Methods;

import java.util.Scanner;

public class Accessor_method {
	
	private int id;			// INSTANCE VARIABLE OR PRIVATE VARIABLE
	
	public int getid()		// GET METHOD IS TO GET THE VALUES OF PRIVATE FIELD
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the ID : ");
		
		id = sc.nextInt();
		
		return id;
	}
	

	public static void main(String[] args) {
		
		Accessor_method obj = new Accessor_method();
		
		System.out.println(" ID : " + obj.getid());

		// TODO Auto-generated method stub

	}

}
