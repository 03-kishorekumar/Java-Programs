package com.Linkedlist;

import java.util.*;


class Bk
{
	int id,quantity;
	
	String name,author,publisher;
	
	Bk(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		
		this.name=name;
		
		this.author=author;
		
		this.publisher=publisher;
		
		this.quantity=quantity;
	}
	
}



public class Linkedlist_expp {

	public static void main(String[] args) {
		
		LinkedList<Bk> li=new LinkedList<Bk>();
		
		Bk b1 = new Bk(101,"xx","kk","mm",20);
		
		Bk b2 = new Bk(102,"pushpa","kissk","sreeleela",1);
		
		
		li.add(b1);
		
		li.add(b2);
		
		for(Bk temp:li)
		{
			System.out.println(temp.id + " " + temp.name + " " + temp.author + " " + temp.publisher + " " + temp.quantity);
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
