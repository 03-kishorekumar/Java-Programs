package com.keywords;


class Person
{
	int id;
	
	String name;
	
	Person(int id,String name)
	{
		this.id=id;
		
		this.name=name;
	}
}

class Employee extends Person
{
	float salary;
	
	Employee(int id,String name,float salary)
	{
		super(id,name);
		
		this.salary=salary;
	}
	
	void display()
	{
		System.out.println(" ID : " + id);
		
		System.out.println(" NAME : " + name);
		
		System.out.println(" SALARY : " + salary);
	}
}




public class Super_exp {

	public static void main(String[] args) {
		
		Employee obj = new Employee(10,"ram",12000);
		
		obj.display();
		
		
		
		// TODO Auto-generated method stub

	}

}
