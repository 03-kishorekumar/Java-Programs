package java_Basic;

import java.util.*;

public class right_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of row : ");
		
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
