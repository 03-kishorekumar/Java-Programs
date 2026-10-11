package com.array;

import java.util.Scanner;

public class Two_dimen_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the no of rows for array 1 : ");
		
		int r=sc.nextInt();
		
		System.out.println(" Enter the no of column for array 1 : ");
		
		int c=sc.nextInt();
		
		int arr1[][]=new int[r][c];
		
		System.out.println(" Enter the elements in an array 1 : ");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(" printing the elements in an ARRAY 1 : ");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(" Enter the no of rows for array 2 : ");
		
		int r1=sc.nextInt();
		
		System.out.println(" Enter the no of column for array 2 : ");
		
		int c1=sc.nextInt();
		
		int arr2[][]=new int[r1][c1];
		
		System.out.println(" Enter the elements in an array 2 : ");
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(" printing the elements in an ARRAY 2 : ");
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		int arr3[][]=new int[r1][c1];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c1;j++)
			{
				for(int k=0;k<c;k++)
				{
					arr3[i][j]=arr1[i][j]+arr2[i][j];
				}
			}
		}
		
		System.out.println(" Matrix After Addition : ");
		
		for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c1; j++) 
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println("");
        }
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
