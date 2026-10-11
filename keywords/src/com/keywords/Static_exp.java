package com.keywords;


import java.util.Scanner;

public class Static_exp {
	
	int id;				//instance variable
	
	String name;		//instance variable
	
	static String college = " VTMT ";
	
	Static_exp(int i,String n)
	{
		id=i;
		
		name=n;
	}
	
	void display()
	{
		System.out.println(" ID : " + id);
		
		System.out.println(" NAME : " + name);
		
		System.out.println(" COLLEGE : " + college);
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the current college name : " + Static_exp.college);
		
		System.out.println(" would u like to change the college name ? yes/no : ");
		
		String choice=sc.nextLine();
		
		if(choice.equalsIgnoreCase("yes"))
		{
			System.out.println(" Enter the new college name : ");
			
			Static_exp.college=sc.nextLine();
		}
		
		System.out.println(" Enter the number of students : ");				//Ask how many students wants to change the college name                  
		
		int num=sc.nextInt();
		
		System.out.println();
		
		Static_exp[] students=new Static_exp[num];			//Getting student details and put it into new array 
		
		Scanner sn=new Scanner(System.in);
		
		for(int i=0;i<num;i++)					// Get details for each students
		{
			System.out.println(" Enter the detail for Student " + (i+1) );
			
			System.out.println(" Enter the ID : ");
			
			int id=sc.nextInt();
			
			System.out.println(" Enter the name : ");
			
			String name = sn.nextLine();
			
			students[i]=new Static_exp(id,name);			//
			
		}
		
		System.out.println("  Student details  ");
		
		for(Static_exp obj : students )
		{
			obj.display();
		}
		
		sc.close();
		
		sn.close();
		// TODO Auto-generated method stub

	}

}
