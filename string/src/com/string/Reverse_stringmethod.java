package com.string;


import java.util.Scanner;


public class Reverse_stringmethod {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter the string : ");
		
		StringBuffer strb= new StringBuffer(sc.nextLine());
		
		System.out.println( " ORIGINAL STRING IS : " + strb);
		
		strb.reverse();
		
		System.out.println( " REVERSE STRING IS : " + strb);
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
