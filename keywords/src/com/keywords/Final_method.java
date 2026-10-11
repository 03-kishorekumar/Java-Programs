package com.keywords;


class Bike
{
	final void run()
	{
		System.out.println(" RUNNING..... ");
	}
	
	void run(String name)
	{
		name="ram";
		
		System.out.println(name);
	}
}

public class Final_method extends Bike {

	public static void main(String[] args) {
		
		Final_method obj = new Final_method();
		
		obj.run();
		
		// TODO Auto-generated method stub

	}

}
