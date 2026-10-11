package com.string;


public class String_count {

	public static void main(String[] args) {
		
		StringBuilder strb=new StringBuilder("Welcome@ # to Java World 2023");
		
		System.out.println(strb);
		
		int upper=0,lower=0,space=0,number=0,vowels=0;
		
		for(int i=0;i<strb.length();i++)
		{
			if(strb.charAt(i)>=97 && strb.charAt(i)<=122)
			{
				lower++;
			}
			if(strb.charAt(i)>=65 && strb.charAt(i)<=90)
			{
				upper++;
			}
			if(strb.charAt(i)>=48 && strb.charAt(i)<=57)
			{
				number++;
			}
			if(strb.charAt(i)==32)
			{
				space++;
			}
			if(strb.charAt(i)=='A'||strb.charAt(i)=='E'||strb.charAt(i)=='I'||strb.charAt(i)=='O'||strb.charAt(i)=='U'||strb.charAt(i)=='a'||strb.charAt(i)=='e'||strb.charAt(i)=='i'||strb.charAt(i)=='o'||strb.charAt(i)=='u')
			{
				vowels++;
			}
		}
		
		System.out.println(" UPPERCASE : " + upper);
		
		System.out.println(" LOWERCASE : " + lower);
		
		System.out.println(" NUMBER : " + number);
		
		System.out.println(" VOWELS : " + vowels);
		
		System.out.println(" SPACE : " + space);
		
		System.out.println(" SYMBOLS : " + (strb.length()-(upper+lower+number+space+vowels)));
		
		
		
		// TODO Auto-generated method stub

	}

}
