package com.keywords;

public class Key_this {
	
	int rollno;
	
	String name;
	
	float fee;
	
	Key_this(int rollno,String name,float fee)
	{
		this.rollno=rollno;					// THIS --->  CURRENT REFERENCE VARIABLE
		
		this.name=name;
		
		this.fee=fee;
	}
	
	void display()
	{
		System.out.println(" ROLLNO : " + rollno);
		
		System.out.println(" NAME : " + name);
		
		System.out.println(" FEE : " + fee);
	}

	public static void main(String[] args) {
		
		Key_this obj=new Key_this(11,"ram",25000);
		
		Key_this obj1=new Key_this(12,"sam",40000);
		
		obj.display();
		
		obj1.display();
		// TODO Auto-generated method stub

	}

}
