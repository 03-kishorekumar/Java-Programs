package com.array;


import java.util.Scanner;


public class Sortarray_desc {

	public static void main(String[] args) {
		
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
		
		System.out.println(" Sorting an elements in an array in descending is : ");
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					
					arr[i]=arr[j];
					
					arr[j]=temp;
				}
			}
			
			System.out.println(arr[i]);
		}
		
		
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
