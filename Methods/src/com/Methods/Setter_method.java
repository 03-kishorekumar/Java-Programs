package com.Methods;

class Set
{
	private int rollno;							// INSTANCE VARIABLE OR PRIVATE VARIABLE
	
	public void setRoll(int rollno)				// SET METHOD IS TO SET THE VALUES OF PRIVATE FIELD        
	{
		this.rollno = rollno;  					// OR int roll = rollno ;
		
		System.out.println(rollno);
	}
	
}


public class Setter_method {

	public static void main(String[] args) {
		
		Set obj= new Set();
		
		System.out.println(" SETTING THE VALUE FOR ROLL NO ");

		obj.setRoll(20);
		
		// TODO Auto-generated method stub

	}

}
