package com.array;

public class Transpose_matrix {

	public static void main(String[] args) {
		
		int original[][]= {{1,2,3},{2,4,3},{3,4,5}};
		
		int transpose[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				transpose[i][j]=original[j][i];
			}
		}
		
		
		System.out.println(" printing the original matrix : ");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(original[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(" printing the transpose matrix : ");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
