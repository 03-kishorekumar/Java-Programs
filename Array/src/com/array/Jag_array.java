package com.array;



import java.util.Scanner;



public class Jag_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the number of players :  ");
		
		int numplayers=sc.nextInt();
		
		int[][] arr=new int[numplayers][];
		
		String[] player = new String[numplayers];
		
		for(int i=0;i<numplayers;i++)
		{
			System.out.println(" Enter the name of player " + (i+1) + " : "  );
			
			player[i]=sc.nextLine();
			
			System.out.println(" Enter no of matches for " + player[i] + " :");		
			
			int match=sc.nextInt();
			
			arr[i]=new int[match];
			
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(" Enter the score for match " + (j+1) + " : ");
				
				arr[i][j]=sc.nextInt();
				
			}
			System.out.println();
			
		}
		
		System.out.println(" scores of players : ");
		
		for(int i=0;i<player.length;i++)
		{
			System.out.println(player[i] + " : ");
			
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
