package com.string;


import java.util.Scanner;

public class Swapstring_with_tempvariable {

	public static void main(String[] args) {
		
		String str1,str2;
		
		String temp="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the 1st String : ");
		
		str1=sc.nextLine();
		
		System.out.println(" Enter the 2nd String : ");
		
		str2=sc.nextLine();
		
		temp=str1;
		
		str1=str2;
		
		str2=temp;
		
		
		sc.close();
		// TODO Auto-generated method stub
	}

}
