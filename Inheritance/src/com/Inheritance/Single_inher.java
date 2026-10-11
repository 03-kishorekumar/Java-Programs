package com.Inheritance;



class Parent
{
	float salary=50000;
}



public class Single_inher extends Parent {
	
	int bonus=3000;

	public static void main(String[] args) {
		
		Parent objj=new Parent();
		
		System.out.println(" PARENT SALARY : " + objj.salary);
		
		Single_inher obj= new Single_inher();
		
		System.out.println(" PARENT SALARY : " + obj.salary);
		
		System.out.println(" CHILD SALARY : " + obj.bonus );
		
		// TODO Auto-generated method stub

	}

}
