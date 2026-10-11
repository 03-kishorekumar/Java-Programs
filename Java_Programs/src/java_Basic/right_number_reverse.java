package java_Basic;


import java.util.*;

public class right_number_reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of row : ");
		
		int row = sc.nextInt();
		
		for(int i=row;i>=1;i--)
		{
			for(int j=row;j>=i;j--)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
