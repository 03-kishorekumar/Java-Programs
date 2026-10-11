package com.Arraylist;

import java.util.ArrayList;

public class Arraylist_meth {

	public static void main(String[] args) 
	{
		ArrayList<String> li=new ArrayList<String>();
		
		li.add("hello");				// ADD METHOD
		
		li.add("hai");
		
		System.out.println(li);
		
		
		
		li.add(1,"hey");				// ADD METHOD AT SPECIFIC POSITION
		
		System.out.println(li);
		
		
		
//		li.remove(0);					// REMOVE METHOD
//		
//		System.out.println(li);
//		
//		li.remove("hai");
//		
//		System.out.println(li);
		
		
		li.set(1, "heloooo");			// SET METHOD
		
		System.out.println(li);
		
//		
//		li.clear();						// CLEAR METHOD
//		
//		System.out.println(li);
		
		
		int te=li.size();						// SIZE METHOD
		
		System.out.println(te);
		
		
		boolean temp = li.contains("hai");		// CONTAINS METHOD
		
		System.out.println(temp);
		
		// TODO Auto-generated method stub

	}

}
