package com.Collection;

import java.util.*;

class Book
{
	int id;
	
	String name,author,publisher;
	
	int quantity;
	
	Book(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		
		this.name=name;
		
		this.author=author;
		
		this.publisher=publisher;
		
		this.quantity=quantity;
	}
}

public class Arraylist_exp {

	public static void main(String[] args) {
		
		List<Book> li=new ArrayList<Book>();
		
		Book b1=new Book(11,"gd","ghd","hdgg",97);
		
		Book b2=new Book(12,"gdhd","ghdgfgfh","hdgghgdjg",90);
		
		Book b3=new Book(13,"gdhdjl","ghdjgdjg","hdggyuu",967);
		
		li.add(b1);
		
		li.add(b2);
		
		li.add(b3);
		
		for(Book b:li)
		{
			System.out.println(b.name+ " " + b.id + " " + b.author + " " + b.publisher);
		}
		
		System.out.println(li.size());    				// size of the list
		
		// TODO Auto-generated method stub

	}

}
