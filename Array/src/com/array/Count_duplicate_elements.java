package com.array;


import java.util.Scanner;

public class Count_duplicate_elements {

	public static void main(String[] args) {
		
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the size of an array : ");
		
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println(" Enter the elements in an array : ");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(" Elements in an array : ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;	
				}
			}
		}
		
		System.out.println(" Total no of duplicate elements in an array is : " + count);
		
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
