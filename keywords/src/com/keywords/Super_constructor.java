package com.keywords;


class Animalss
{
	Animalss()
	{
		System.out.println(" animal is created ");
	}
}

class Dogss extends Animalss
{
	Dogss()
	{
		super();
		
		System.out.println(" dog is created ");
	}
}



public class Super_constructor {

	public static void main(String[] args) {
		
		Dogss obj = new Dogss();
		
//		Animalss obj = new Animalss();
		
		
		// TODO Auto-generated method stub

	}

}
