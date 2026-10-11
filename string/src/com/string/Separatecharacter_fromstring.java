package com.string;


import java.util.Scanner;


public class Separatecharacter_fromstring {

	public static void main(String[] args) {
		
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the string : ");
		
		str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
