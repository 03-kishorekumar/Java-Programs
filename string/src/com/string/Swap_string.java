package com.string;


import java.util.Scanner;


public class Swap_string {

	public static void main(String[] args) {
		
		String str1,str2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the 1st String : ");
		
		str1=sc.nextLine();
		
		System.out.println(" Enter the 2nd String : ");
		
		str2=sc.nextLine();
		
		str1=str1+str2;
		
		str2=str1.substring(0,str1.length()-str2.length());
		
		str1=str1.substring(str2.length());
		
		System.out.println(" After swapping value of str1 : " + str1);
		
		System.out.println(" After swapping value of str2 : " + str2);
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
