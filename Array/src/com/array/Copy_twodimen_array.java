package com.array;


import java.util.Scanner;

public class Copy_twodimen_array {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter no of rows in an array : ");
		
		int row = sc.nextInt();
		
		System.out.println(" Enter no of columns in an array : ");
		
		int col = sc.nextInt();
		
		int arr[][]=new int[row][col];
		
		System.out.println(" Enter the elements in an array 1 : ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(" Elements in an array 1 : ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		int arr1[][]=new int[row][col];
		
		System.out.println(" copying an array ...... ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr1[i][j]=arr[i][j];
			}
		}
		
		System.out.println("");
		
		System.out.println(" Elements in array 2 : ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
