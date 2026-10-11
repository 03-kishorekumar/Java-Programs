
package com.string;

import java.util.Scanner;

public class String_upper {

	public static void main(String[] args) {
		
		String str;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" Enter the string in uppercase : ");
		
		str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char) ((int) (ch[i]+32));
			}
		}
		
		System.out.println(" lowercase string is : ");
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
