package com.Inheritance;

class A1
{
	int a;
	
	void display()
	{
		System.out.println(" GRANDPARENT CLASS ");
	}
}

class B1 extends A1
{
	int b;
	
	void show()
	{
		System.out.println(" PARENT CLASS ");
	}
}

class C1 extends B1
{
	int c;
	
	void print()
	{
		System.out.println(" CHILD CLASS ");
	}
}

public class Multi_inhert {

	public static void main(String[] args) {
		
		C1 obj = new C1();
		
		obj.a=10;
		
		obj.b=20;
		
		obj.c=30;
		
		System.out.println(obj.a);
		
		System.out.println(obj.b);
		
		System.out.println(obj.c);
		
		obj.display();
		
		obj.show();
		
		obj.print();
		
		// TODO Auto-generated method stub

	}

}
