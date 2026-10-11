package com.string;


import java.util.*;

public class duplicate_character {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		
		String input = sc.nextLine().toLowerCase().replace(" ", "");
		
		char[] ch=input.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int count = 1;
					
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					
					ch[j] = '0'; 
				}
			}
			
			if(count>1 && ch[i] !='0')
			{
				System.out.print(count + "-");
				
				System.out.print(ch[i] + " ");
			}
		}
		
		sc.close();
	}

}
