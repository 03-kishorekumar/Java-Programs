 package com.array;

import java.util.Scanner;


public class Rightrotate_array {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
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
		
		System.out.println("");
		
		System.out.println(" Enter no of times to rotate an array to right : ");
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int last;
			
			last=arr[arr.length-1];
			
			for( int j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			
			arr[0]=last;
		}
		
		System.out.println(" Array after right rotate ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
