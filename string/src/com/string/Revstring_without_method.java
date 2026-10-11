package com.string;


import java.util.Scanner;


public class Revstring_without_method {

	public static void main(String[] args) {
		
		String str,rev="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the string : ");
		
		str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
//			rev=rev+str.charAt(i);
			
			System.out.print(ch[i]);
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
