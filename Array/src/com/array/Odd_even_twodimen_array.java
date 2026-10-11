package com.array;


import java.util.Scanner;

public class Odd_even_twodimen_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the no of row in array  : ");
		
		int r1=sc.nextInt();
		
		System.out.println(" Enter the no of column in array  : ");
		
		int c1=sc.nextInt();
		
		int arr1[][]=new int[r1][c1];
		
		System.out.println(" Enter the elements in an array : ");
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(" Elements in an array are : ");
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println(" Even numbers in an array is : ");
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr1[i][j] % 2 == 0)
				{
					System.out.println(arr1[i][j] + " ");
				}
			}
		}
		
		System.out.println(" Odd numbers in an array is : ");
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr1[i][j] % 2 != 0)
				{
					System.out.println(arr1[i][j] + " ");
				}
			}
		}
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
