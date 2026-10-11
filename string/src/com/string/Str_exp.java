package com.string;


import java.util.Scanner;

public class Str_exp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter a string : ");
		
		String str=sc.nextLine();
		System.out.println(str);
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
