package com.string;

import java.util.*;

public class duplicate_words {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		
		String input=sc.nextLine().toLowerCase();
		
		String[] words=input.split("\\s+");
		
		for(int i=0;i<words.length;i++)
		{
			int count =1;
			
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					
					words[j]="0";
				}
			}
			
			if(count>1)
			{
				System.out.print(words[i] + " - ");
				
				System.out.print(count + " ");
			}
		}
		
		sc.close();
		

	}

}
