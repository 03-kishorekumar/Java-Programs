package com.array;

import java.util.Scanner;


public class Leftrotate_array {

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
		
		System.out.println(" Enter no of times to rotate an array to left : ");
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int j, first;
			
			first=arr[0];
			
			for( j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			
			arr[j]=first;
		}
		
		System.out.println(" Array after left rotate : ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
