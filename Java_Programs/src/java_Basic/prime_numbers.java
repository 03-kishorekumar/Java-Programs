package java_Basic;

import java.util.*;

public class prime_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Starting number of the range :");
		
		int start = sc.nextInt();
		
		System.out.println(" Enter the Ending number of the range :");
		
		int end = sc.nextInt();
		
		for(int num=start;num<=end;num++)
		{
			Boolean flag = true;
			
			if(num<=1)
			{
				System.out.println(num + " is not a prime number ");
				
				flag = false;
				
				break;
			}
			else
			{
				for(int j=2 ; j<=num/2; j++)
				{
					if(num % j==0)
					{
						flag = false;
						
//						System.out.println(num +" is not a Prime number");
						
						break;
					}
				}
				
			}
			
			if(flag==true)
			{
				System.out.println(num +" is a Prime number");
			}
			
		}
		
		sc.close();

	}

}
