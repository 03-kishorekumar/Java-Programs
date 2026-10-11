package com.Inheritance;


class Parent1
{
	int a;
	
	void display()
	{
		System.out.println(" SUPER CLASS ");
	}
}

class Child1 extends Parent1
{
	int b;
	
	void print()
	{
		System.out.println(" SUB CLASS 1 ");
	}
}

class Child2 extends Parent1
{
	int c;
	
	void show()
	{
		System.out.println(" SUB CLASS 2");
	}
}





public class Hierarchial {

	public static void main(String[] args) {
		
		Child1 obj = new Child1();
		
		Child2 obj1 = new Child2();
		
		System.out.println(obj.a=10);
		
		System.out.println(obj.b=20);
		
		obj.display();
		
		obj.print();
		
		System.out.println(obj1.a=30);
		
		System.out.println(obj1.c=40);
		
		obj1.display();
		
		obj1.show();
		
		// TODO Auto-generated method stub

	}

}
