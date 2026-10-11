package com.array;


import java.util.Scanner;


public class Sum_multidimen_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the no of rows : ");
		
		int r = sc.nextInt();
		
		System.out.println(" Enter the no of column : ");
		
		int c = sc.nextInt();
		
		int arr[][]=new int[r][c];
		
		System.out.println(" Enter the elements in an array : ");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(" Elements in an array is : ");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		int sum=0;
		
		System.out.println(" Sum of the array is : ");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				sum+=arr[i][j];
			}
		}
		
		System.out.println(sum + "");
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
