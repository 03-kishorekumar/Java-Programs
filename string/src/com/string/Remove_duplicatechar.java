package com.string;


import java.util.Scanner;


public class Remove_duplicatechar {

	public static void main(String[] args) {
		
		String str;
		
		int count;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the string value : ");
		
		str=sc.nextLine();
		
		String strr=str.replace(" ", "");
		
		char ch[]=strr.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			count =1;
			
			for(int j=i+1;j<ch.length;j++)
			{
				
				if(ch[i]==ch[j])
				{
					
					count++;
					
					ch[j]='0';
				}
			}
			
			if(count>1 && ch[i]!='0')
			{
				System.out.println(ch[i]);
			}
		}
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
