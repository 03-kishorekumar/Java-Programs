package com.keywords;

public class Static_var {
	
	int id;
	
	String name;
	
	static String college=" VTMT ";
	
	Static_var(int i,String n)
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
		
		Static_var obj = new Static_var(111,"ram");
		
		Static_var obj1 = new Static_var(232,"sam");
		
		obj.display();
		
		obj1.display();
		
		
		// TODO Auto-generated method stub

	}

}
