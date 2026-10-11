package com.Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_exp {

	public static void main(String[] args) {
		
		TreeSet<Integer> li = new TreeSet<Integer>();
		
		li.add(20);
		
		li.add(25);
		
		li.add(30);
		
		ArrayList<Integer> li1=new ArrayList<Integer>();
		
		li1.add(48);
		
		li1.add(40);
		
		li1.add(60);
		
		li.addAll(li1);
		
		Iterator itr=li.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("CELEING : " + li.ceiling(23));
		
		System.out.println("FLOOR : " + li.floor(34));
		
		System.out.println("CONTAINS : " + li.contains(30));
		
		System.out.println("HEADSET : " + li.headSet(35));
		
		System.out.println("TAILSET : " + li.tailSet(55));
		
		System.out.println(li.size());
		
		// TODO Auto-generated method stub

	}

}
