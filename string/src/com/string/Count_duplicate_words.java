package com.string;


import java.util.Scanner;


public class Count_duplicate_words {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the string value : ");
		
		String str=sc.nextLine().toLowerCase().replace(" ", "");
		
		char ch[]=str.toCharArray();
		
		int count;
		
		int total=0;
		
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			
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
				total = total + (count-1);
			}
			
		}
		
		System.out.println("Total Duplicate Characters in a String is : " + total);
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
